package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.pojo.Story;

public interface StoryInfoRepository extends JpaRepository<Story, Long> {
	

}
