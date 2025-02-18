package org.zerock.blog.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.zerock.blog.springbootdeveloper.domain.Comment;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddCommentResponse {
    private Long id;
    private String content;

    public AddCommentResponse(Comment comment) {
        this.id = comment.getId();
        this.content = comment.getContent();
    }
}
