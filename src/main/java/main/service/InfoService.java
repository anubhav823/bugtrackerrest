package main.service;

import java.util.List;
import java.util.Optional;

import main.pojo.Story;
import main.pojo.Users;

public interface InfoService {

	public List<Users> getAllUsers();

	public List<Story> getStoriesByAssignedUser(Long userId);

	public List<Story> getStoriesWithSameReporter(Long userId);

	public List<Story> getAllStories();

	public Optional<Users> findByEmail(String email);
}
