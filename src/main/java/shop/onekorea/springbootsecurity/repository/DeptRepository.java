package shop.onekorea.springbootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.onekorea.springbootsecurity.entity.Dept;

public interface DeptRepository extends JpaRepository<Dept, Long> {
}
