package org.example.backendproject.comment.repository;

import java.util.List;
import org.example.backendproject.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBoardId(Long boardId);

    List<Comment> findByUserId(Long userId);

}
