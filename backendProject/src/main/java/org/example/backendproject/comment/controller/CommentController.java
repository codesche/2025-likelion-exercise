package org.example.backendproject.comment.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.backendproject.comment.dto.CommentDTO;
import org.example.backendproject.comment.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService commentService;

    @PostMapping
    public ResponseEntity<CommentDTO> save(@RequestBody CommentDTO commentDTO) {

        CommentDTO response = commentService.saveComment(commentDTO);
        return ResponseEntity.ok(response);
    }

    // 게시글의 전체 댓글+대댓글 계층 조회
    @GetMapping
    public List<CommentDTO> getAllComments(@RequestParam Long boardId) {
        return commentService.findCommentsByBoardId(boardId); // 반드시 계층구조 반환!
    }

    // 특정 사용자의 댓글 조회
    @GetMapping("/{id}")
    public List<CommentDTO> getComments(@PathVariable Long id) {
        return commentService.findCommentByUserId(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id); // id로 댓글 삭제
        return ResponseEntity.ok().build();
    }

}
