package main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import main.pojo.Users;

@Component
public interface UserInfoRepository extends JpaRepository<Users, String>{

	Optional<Users> findByEmail(String email);

}
