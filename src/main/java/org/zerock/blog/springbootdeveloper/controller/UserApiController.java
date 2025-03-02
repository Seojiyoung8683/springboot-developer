package org.zerock.blog.springbootdeveloper.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.zerock.blog.springbootdeveloper.dto.AddUserRequest;
import org.zerock.blog.springbootdeveloper.service.UserService;

@RequiredArgsConstructor
@Controller
public class UserApiController {
    private final UserService userService;
    @PostMapping("/user")
    public String signup(AddUserRequest request){
        userService.save(request);
        return "redirect:/login";
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response){
        new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
        return "redirect:/login";
    }
}
