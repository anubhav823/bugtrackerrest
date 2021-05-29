package main.repository;

import org.springframework.data.repository.CrudRepository;

import main.pojo.Users;

public interface MgmtRepository extends CrudRepository<Users, Long> {

}
