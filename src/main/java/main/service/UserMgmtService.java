package main.service;

import main.pojo.Story;
import main.pojo.Users;

public interface UserMgmtService {

	public void registerNewUser(Users user);

	public void deleteUserById(Long id);

	public void updateById(Users user, Long id);
}
