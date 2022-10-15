package main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.pojo.Story;
import main.pojo.Users;
import main.repository.StoryInfoRepository;
import main.repository.UserInfoRepository;
import main.service.InfoService;

@Service
public class InfoServiceImpl implements InfoService {

	private static final Logger logger = LoggerFactory.getLogger(InfoServiceImpl.class);
	@Autowired
	private UserInfoRepository userInfoRepository;
	@Autowired
	private StoryInfoRepository storyInfoRepository;

	@Override
	public List<Users> getAllUsers() {
		logger.info("entered getAllUsers");
		List<Users> userList = userInfoRepository.findAll();
		logger.info("exited getAllUsers");
		return userList;
	}

	@Override
	public List<Story> getStoriesWithSameReporter(Long userId) {
		logger.info("entered getStoriesWithSameReporter");
		List<Story> storyList = null;
//		storyList=userInfoRepository.getStoriesWithSameReporter(userId);
		logger.info("exited getStoriesWithSameReporter");
		return storyList;
	}

	@Override
	public List<Story> getStoriesByAssignedUser(Long userId) {
		logger.info("entered getStoriesByAssignedUser");
		List<Story> storyList = null;
//		storyList=userInfoRepository.getStoriesByAssignedUser(userId);
		logger.info("exited getStoriesByAssignedUser");
		return storyList;
	}

	@Override
	public List<Story> getAllStories() {
		logger.info("entered getAllUsers");
		List<Story> storyList = storyInfoRepository.findAll();
		logger.info("exited getAllUsers");
		return storyList;
	}

	@Override
	public Optional<Users> findByEmail(String email) {
		logger.info("entered getAllUsers");
		Optional<Users> user = userInfoRepository.findByEmail(email);
		logger.info("exited getAllUsers");
		return user;
	}

}
