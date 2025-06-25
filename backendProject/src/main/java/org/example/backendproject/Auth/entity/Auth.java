package org.example.backendproject.Auth.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.backendproject.user.entity.User;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Auth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tokenType;

    @Column(nullable = false)
    private String accessToken;

    @Column(nullable = false)
    private String refreshToken;

    @OneToOne(fetch = FetchType.LAZY)           // 1:1 관계, 지연로딩 적용 -> Auth 엔티티 조회할 때 user 객체는 불러오지 않음
    @JoinColumn(name = "user_id")               // auth.getUser()에 실제로 접근할 때 User 쿼리 발생!!
    private User user;

    // updateAccessToken 메서드 추가
    //토큰값을 업데이트 해주는 메서드
    public void updateAccessToken(String newAccessToken) {
        this.accessToken = newAccessToken;
    }

    // updateRefreshToken 메서드 추가
    public void updateRefreshToken(String newRefreshToken) {
        this.refreshToken = newRefreshToken;
    }

    public Auth(User user, String refreshToken, String accessToken, String tokenType) {
        this.user = user;
        this.refreshToken = refreshToken;
        this.accessToken = accessToken;
        this.tokenType = tokenType;
    }
}
