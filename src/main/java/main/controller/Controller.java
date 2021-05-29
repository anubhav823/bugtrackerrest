package main.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import main.pojo.LoginUser;
import main.pojo.Story;
import main.pojo.Users;
import main.service.InfoService;
import main.service.StoryMgmtService;
import main.service.UserMgmtService;

@RestController
@RequestMapping(value = "/")
public class Controller {
	private static final Logger logger = LoggerFactory.getLogger(Controller.class);

	@Autowired
	private InfoService infoService;
	@Autowired
	private StoryMgmtService storyMgmtService;
	@Autowired
	private UserMgmtService userMgmtService;

	@GetMapping(value = "users")
	public List<Users> getAllUsers() {
		logger.info("entered getAllUsers");
		List<Users> usersList = infoService.getAllUsers();
		logger.info("exited getAllUsers");
		return usersList;
	}

	@PostMapping(value = "user")
	public ResponseEntity registerNewUser(@RequestBody Users user) {
		logger.info("entered registerNewUser");
		HttpStatus httpStatus = HttpStatus.OK;
		userMgmtService.registerNewUser(user);
		logger.info("exited registerNewUser");
		return new ResponseEntity<>(httpStatus);
	}

	@PutMapping(value = "user/{id}")
	public ResponseEntity updateUserById(@PathVariable("id") Long id, @RequestBody Users user) {
		logger.info("entered updateUserById");
		HttpStatus httpStatus = HttpStatus.OK;
		userMgmtService.updateById(user, id);
		logger.info("exited updateUserById");
		return new ResponseEntity<>(httpStatus);
	}

	@DeleteMapping(value = "user/{id}")
	public ResponseEntity deleteUserById(@PathVariable("id") Long id) {
		logger.info("entered deleteUserById");
		HttpStatus httpStatus = HttpStatus.OK;
		userMgmtService.deleteUserById(id);
		logger.info("exited deleteUserById");
		return new ResponseEntity<>(httpStatus);
	}

	@PutMapping(value = "user/login")
	public ResponseEntity loginUser(@RequestBody LoginUser user) {
		logger.info("entered loginUser");
		HttpStatus httpStatus = HttpStatus.OK;
		infoService.loginUser(user);
		logger.info("exited loginUser");
		return new ResponseEntity<>(httpStatus);
	}

	@PostMapping(value = "story")
	public ResponseEntity createNewStory(@RequestBody Story story) {
		logger.info("entered createNewStory");
		HttpStatus httpStatus = HttpStatus.OK;
		storyMgmtService.createNewStory(story);
		logger.info("exited createNewStory");
		return new ResponseEntity<>(httpStatus);
	}

	@PutMapping(value = "story/{storyid}")
	public ResponseEntity updateStoryById(@PathVariable("storyid") Long storyid, Story story) {
		logger.info("entered updateStoryById");
		HttpStatus httpStatus = HttpStatus.OK;
		storyMgmtService.updateStoryById(storyid, story);
		logger.info("exited updateStoryById");
		return new ResponseEntity<>(httpStatus);
	}

	@DeleteMapping(value = "story/{storyid}")
	public ResponseEntity deleteStoryById(@PathVariable("storyid") Long storyid) {
		logger.info("entered deleteStoryById");
		HttpStatus httpStatus = HttpStatus.OK;
		storyMgmtService.deleteStoryById(storyid);
		logger.info("exited deleteStoryById");
		return new ResponseEntity<>(httpStatus);
	}

	@GetMapping(value = "story/user/{userId}")
	public List<Story> getStoriesAssignedToUser(@PathVariable("userId") Long userId) {
		logger.info("entered getStoriesAssignedToUser");
		List<Story> storyList = infoService.getStoriesByAssignedUser(userId);
		logger.info("exited getStoriesAssignedToUser");
		return storyList;

	}

	@GetMapping(value = "user/story/{userId}")
	public List<Story> getStoriesReportedByUser(@PathVariable("userId") Long userId) {
		logger.info("entered getStoriesReportedByUser");
		List<Story> storyList = infoService.getStoriesWithSameReporter(userId);
		logger.info("exited getStoriesReportedByUser");
		return storyList;
	}
}
