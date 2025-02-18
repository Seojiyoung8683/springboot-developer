package org.zerock.blog.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.blog.springbootdeveloper.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
