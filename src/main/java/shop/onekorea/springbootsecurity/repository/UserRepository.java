package shop.onekorea.springbootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.onekorea.springbootsecurity.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
