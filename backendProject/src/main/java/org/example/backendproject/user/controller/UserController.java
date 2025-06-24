package org.example.backendproject.user.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.backendproject.user.dto.UserDTO;
import org.example.backendproject.user.entity.User;
import org.example.backendproject.user.service.UserService;
import org.springframework.http.ResponseEntity;
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
    @GetMapping("/me/{id}")
    public ResponseEntity<UserDTO> getMyInfo(@PathVariable("id") Long userId){
        return ResponseEntity.ok(userService.getMyInfo(userId));
    }

    /** 유저 정보 수정 **/
    @PutMapping("/me/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable("id") Long userId, @RequestBody UserDTO dto) {
        UserDTO updated = userService.updateUser(userId, dto);
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
