package shop.onekorea.springbootsecurity.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
@Entity
@ToString(of = {"deptCode", "deptName", "updatedAt", "createdAt"})
public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "dept_code", length = 100)
    private String deptCode;
    @Column(nullable = false, name = "dept_name", length = 100)
    private String deptName;
    private LocalDateTime updatedAt;
    @Builder.Default
    private LocalDateTime createdAt=LocalDateTime.now();

    public Dept(String deptCode, String deptName, LocalDateTime updatedAt) {
        /**
         * 여기에 명기를 하지 않은 컬럼은 "SpringbootApplication.class"에서 데이터를 추가할 때, 그 값이 "null"로 들어가네...
         */
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

}
