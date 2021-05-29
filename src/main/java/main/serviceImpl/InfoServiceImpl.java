package main.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.pojo.LoginUser;
import main.pojo.Story;
import main.pojo.Users;
import main.repository.UserInfoRepository;
import main.service.InfoService;

@Service
public class InfoServiceImpl implements InfoService {

	private static final Logger logger = LoggerFactory.getLogger(InfoServiceImpl.class);
	@Autowired
	private UserInfoRepository userInfoRepository;

	@Override
	public List<Users> getAllUsers() {
		logger.info("entered getAllUsers");
		List<Users> userList=userInfoRepository.findAll();
		logger.info("exited getAllUsers");
		return userList;
	}


	@Override
	public void loginUser(LoginUser user) {
		logger.info("entered loginUser");
//		userInfoRepository.loginUser(user);
		logger.info("exited loginUser");
	}

	@Override
	public List<Story> getStoriesWithSameReporter(Long userId) {
		logger.info("entered getStoriesWithSameReporter");
		List<Story> storyList=null;
//		storyList=userInfoRepository.getStoriesWithSameReporter(userId);
		logger.info("exited getStoriesWithSameReporter");
		return storyList;
	}

	@Override
	public List<Story> getStoriesByAssignedUser(Long userId) {
		logger.info("entered getStoriesByAssignedUser");
		List<Story> storyList=null;
//		storyList=userInfoRepository.getStoriesByAssignedUser(userId);
		logger.info("exited getStoriesByAssignedUser");
		return storyList;
	}

}
