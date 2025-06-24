package org.example.backendproject.Auth.service;

import lombok.RequiredArgsConstructor;
import org.example.backendproject.Auth.dto.LoginRequestDTO;
import org.example.backendproject.Auth.dto.SignUpRequestDTO;
import org.example.backendproject.user.dto.UserDTO;
import org.example.backendproject.user.dto.UserProfileDTO;
import org.example.backendproject.user.entity.User;
import org.example.backendproject.user.entity.UserProfile;
import org.example.backendproject.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AuthService {

    private final UserRepository userRepository;

    @Transactional                             // 해당 어노테이션 선언해야 저장이 된다.
    public void signUp(SignUpRequestDTO dto) {

        // 사용자 조회 여부 확인, null값 체크
        if (userRepository.findByUserid(dto.getUserid()).isPresent()) {
            throw new RuntimeException("사용자가 이미 존재합니다.");
        }

        User user = new User();
        user.setUserid(dto.getUserid());
        user.setPassword(dto.getPassword());

        UserProfile profile = new UserProfile();
        profile.setUsername(dto.getUsername());
        profile.setEmail(dto.getEmail());
        profile.setPhone(dto.getPhone());
        profile.setAddress(dto.getAddress());

        /**  연관관계 설정 **/
        profile.setUser(user);
        user.setUserProfile(profile);

        userRepository.save(user);
    }

    public UserDTO login(LoginRequestDTO loginRequestDTO) {
        User user = userRepository.findByUserid(loginRequestDTO.getUserid())
            .orElseThrow(() -> new RuntimeException("사용자를 찾을 수 없습니다."));

        if (!loginRequestDTO.getPassword().equals(user.getPassword())) {
            throw new RuntimeException("비밀번호를 찾을 수 없습니다.");
        }

        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUserid(user.getUserid());

        // 유저 프로필
        UserProfileDTO profileDTO = new UserProfileDTO();
        profileDTO.setUsername(user.getUserProfile().getUsername());
        profileDTO.setEmail(user.getUserProfile().getEmail());
        profileDTO.setPhone(user.getUserProfile().getPhone());
        profileDTO.setAddress(user.getUserProfile().getAddress());

        return userDTO;
    }
}

