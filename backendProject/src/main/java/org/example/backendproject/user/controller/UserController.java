package org.example.backendproject.user.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.backendproject.security.core.CustomUserDetails;
import org.example.backendproject.user.dto.UserDTO;
import org.example.backendproject.user.entity.User;
import org.example.backendproject.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

//    @Value("${PROJECT_NAME:web Server}")
//    private String instanceName;
//
//    @GetMapping
//    public String test() {
//        return instanceName;
//    }

    private final UserService userService;

    /** 내 정보 보기 **/
    @GetMapping("/me")
    public ResponseEntity<UserDTO> getMyInfo(@AuthenticationPrincipal CustomUserDetails userDetails){
        Long id = userDetails.getId();
        return ResponseEntity.ok(userService.getMyInfo(id));
    }

    // @AuthenticationPrincipal - 스프링 시큐리티에서 인증한 사용자 정보를 자동으로 주입받는 어노테이션
    // 요청 헤더 안에 있는 JWT 토큰에서 사용자 정보를 읽어옴
    /** 유저 정보 수정 **/
    @PutMapping("/me")
    public ResponseEntity<UserDTO> updateUser(@AuthenticationPrincipal CustomUserDetails userDetails,
        @RequestBody UserDTO dto) {
        Long id = userDetails.getId();
        UserDTO updated = userService.updateUser(id, dto);
        return ResponseEntity.ok(updated);
    }

    // dto로 순환참조 방지
    @GetMapping("/profile/{profileId}")
    public UserDTO getProfile(@PathVariable Long profileId)  {
        return userService.getProfile(profileId);
    }

    @PostMapping("/jpaSaveAll")
    public String saveAll(@RequestBody List<User> users) {
        userService.saveAllUsers(users);
        return "ok";
    }

}
