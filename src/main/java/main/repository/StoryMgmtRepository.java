package main.repository;

import org.springframework.data.repository.CrudRepository;

import main.pojo.Story;

public interface StoryMgmtRepository extends CrudRepository<Story, Long> {
	
}
