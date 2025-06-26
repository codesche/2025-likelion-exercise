package org.example.backendproject.Auth.repository;

import java.util.Optional;
import org.example.backendproject.Auth.entity.Auth;
import org.example.backendproject.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Auth, Long> {

    Optional<Auth> findByRefreshToken(String refreshToken);

    boolean existsByUser(User user);

    // Auth 엔티티에 토큰 저장 (User와 1:1 매핑)
    Optional<Auth> findByUser(User user);
}
