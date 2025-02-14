package org.zerock.blog.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.blog.springbootdeveloper.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
