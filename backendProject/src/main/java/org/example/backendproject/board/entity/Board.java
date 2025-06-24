package org.example.backendproject.board.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.backendproject.comment.entity.Comment;
import org.example.backendproject.user.entity.BaseTime;
import org.example.backendproject.user.entity.User;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Board extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    private String batchKey;

    // 아래는 글을 작성한 유저 정보
    // 연관관계 매핑
    // 다대일
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    // 일대다
    @OneToMany(mappedBy = "board")
    private List<Comment> comment = new ArrayList<>();

}
