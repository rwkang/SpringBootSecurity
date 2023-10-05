package shop.onekorea.springbootsecurity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String postId;
    @Column(length = 255)
    private String title;
    @Column(length = 500)
    private String contents;
    @Column(nullable = false, length = 100)
    private String author;
    @Builder.Default
    private LocalDateTime createdAt=LocalDateTime.now();

    public Post(String postId, String title, String contents, String author) {
//        this.postId = postId;
        this.title = title;
        this.contents = contents;
        this.author = author;
    }

}
