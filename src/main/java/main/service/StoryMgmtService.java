package main.service;

import main.pojo.Story;

public interface StoryMgmtService {

	public void createNewStory(Story story);

	public void updateStoryById(Long storyid, Story story);

	public void deleteStoryById(Long storyid);
}
