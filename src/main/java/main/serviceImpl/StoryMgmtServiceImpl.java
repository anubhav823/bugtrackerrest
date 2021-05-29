package main.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.pojo.Story;
import main.repository.StoryMgmtRepository;
import main.service.StoryMgmtService;
@Service
public class StoryMgmtServiceImpl implements StoryMgmtService{
	private static final Logger logger = LoggerFactory.getLogger(UserMgmtServiceImpl.class);
	@Autowired
	private StoryMgmtRepository storyMgmtRepository;

	@Override
	public void createNewStory(Story story) {
		logger.info("entered createNewStory");
		storyMgmtRepository.save(story);
		logger.info("exited createNewStory");
	}

	@Override
	public void updateStoryById(Long storyid, Story story) {
		logger.info("entered updateStoryById");
		storyMgmtRepository.save(story);
		logger.info("exited updateStoryById");
	}

	@Override
	public void deleteStoryById(Long storyid) {
		logger.info("entered deleteStoryById");
		storyMgmtRepository.deleteById(storyid);
		logger.info("exited deleteStoryById");
	}
}
