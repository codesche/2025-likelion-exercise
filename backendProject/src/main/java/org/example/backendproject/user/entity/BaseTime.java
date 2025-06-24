package org.example.backendproject.user.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter

// JPA 엔티티의 생성/수정 시점을 자동으로 기록하도록 이벤트 리스너로 동작하도록 하는 어노테이션
@EntityListeners(AuditingEntityListener.class)

// 이 클래스를 상속받는 엔티티들은 이 클래스의 필드를 컬럼으로 포함시키라는 어노테이션
@MappedSuperclass
public abstract class BaseTime {

    // 엔티티가 저장될 때 자동으로 시간을 기록
    @CreatedDate
    private LocalDateTime created_date;

    // 엔티티가 수정될 때 자동으로 시간 기록
    @LastModifiedDate
    private LocalDateTime updated_date;

}
