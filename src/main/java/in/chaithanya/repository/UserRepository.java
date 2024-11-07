package in.chaithanya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.chaithanya.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
