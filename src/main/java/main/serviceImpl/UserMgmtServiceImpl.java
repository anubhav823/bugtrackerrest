package main.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import main.pojo.Users;
import main.repository.MgmtRepository;
import main.service.UserMgmtService;

@Service
@Transactional(readOnly = false)
public class UserMgmtServiceImpl implements UserMgmtService {

	private static final Logger logger = LoggerFactory.getLogger(UserMgmtServiceImpl.class);
	@Autowired
	private MgmtRepository userMgmtRepository;

	@Override
	public void registerNewUser(Users user) {
		logger.info("entered registerNewUser");
		userMgmtRepository.save(user);
		logger.info("exited registerNewUser");
	}

	@Override
	public void deleteUserById(Long id) {
		logger.info("entered deleteUserById");
		userMgmtRepository.deleteById(id);
		logger.info("exited deleteUserById");
	}

	@Override
	public void updateById(Users user, Long id) {
		logger.info("entered updateUserById");
		userMgmtRepository.save(user);
		logger.info("exited updateUserById");
	}

}
