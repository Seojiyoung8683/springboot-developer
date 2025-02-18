package org.zerock.blog.springbootdeveloper.config.error.exception;

import org.zerock.blog.springbootdeveloper.config.error.ErrorCode;

public class ArticleNotFoundException extends NotFoundException{
    public ArticleNotFoundException() {
        super(ErrorCode.ARTICLE_NOT_FOUND);
    }
}
