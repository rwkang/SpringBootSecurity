package shop.onekorea.springbootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.onekorea.springbootsecurity.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
