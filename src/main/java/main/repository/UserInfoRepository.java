package main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import main.pojo.LoginUser;
import main.pojo.Story;
import main.pojo.Users;

@Component
public interface UserInfoRepository extends JpaRepository<Users, String>{

}
