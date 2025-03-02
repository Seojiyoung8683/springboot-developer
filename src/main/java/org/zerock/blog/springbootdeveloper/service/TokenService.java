package org.zerock.blog.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zerock.blog.springbootdeveloper.config.jwt.TokenProvider;
import org.zerock.blog.springbootdeveloper.domain.User;

import java.time.Duration;

@RequiredArgsConstructor
@Service
public class TokenService {
    private final TokenProvider tokenProvider;
    private final RefreshTokenService refreshTokenService;
    private final UserService userService;

    public String createNewAccessToken(String refreshToken) {
        //토큰 유효성 검사에 실패하면 예외 발생
        if(!tokenProvider.validateToken(refreshToken)) {
            throw new IllegalArgumentException("Unexpected token");
        }
        Long userId= refreshTokenService.findByRefreshToken(refreshToken).getUserId();
        User user = userService.findById(userId);

        return tokenProvider.generateToken(user, Duration.ofHours(2));
    }
}
