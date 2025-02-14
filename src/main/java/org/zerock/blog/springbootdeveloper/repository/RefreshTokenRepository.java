package org.zerock.blog.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.blog.springbootdeveloper.domain.RefreshToken;

import java.sql.Ref;
import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByUserId(Long userId);
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
