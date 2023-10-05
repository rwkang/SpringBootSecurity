package shop.onekorea.springbootsecurity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenerationTime;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 100, unique = true)
    private String userId;
    @Column(length = 100, unique = true)
    private String email;
    @Column(length = 100)
    private String name;
    @Column(length = 100, nullable = false)
    private String password;
    @Column(length = 100)
    private String role;
    @Column(length = 100)
    private String phoneNo;
    @Column(length = 100)
    private String address;
    @Column(length = 100)
    private String profile;
    @Column(length = 100)
    private String empNo;
    @Column(length = 100)
    private String deptCode;

    @org.hibernate.annotations.Generated(GenerationTime.ALWAYS) // 2023.09.29 Conclusion. "생성" 시에만 "서버 컴퓨터 시간"을 사용하고,
    @Column(name = "updated_At", updatable = true)              //                        "update" 시에는 "수정 되도록" : 생략 가능 ∵) true가 디폴트 임.
    private LocalDateTime updatedAt;
    @Builder.Default
    @org.hibernate.annotations.Generated(GenerationTime.ALWAYS) // 2023.09.29 Conclusion. "생성" 시에만 "서버 컴퓨터 시간"을 사용하고,
    @Column(name = "created_At", updatable = false)             //                        "update" 시에는 "수정 안 됨"
    private LocalDateTime createdAt=LocalDateTime.now();

    public User(
            String userId,
            String email,
            String name,
            String password,
            String role,
            String phoneNo,
            String address,
            String profile,
            String empNo,
            String deptCode,
            LocalDateTime updatedAt) {
//        this.userId = userId;
        this.email = email;
        this.name = name;
        this.password = password;
        this.role = role;
        this.phoneNo = phoneNo;
        this.address = address;
        this.profile = profile;
        this.empNo = empNo;
        this.deptCode = deptCode;
        this.updatedAt = updatedAt;
    }

}
