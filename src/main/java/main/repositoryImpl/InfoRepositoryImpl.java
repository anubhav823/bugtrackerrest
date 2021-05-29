//package main.repositoryImpl;
//
//import java.util.List;
//
//import org.hibernate.Criteria;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.criterion.Restrictions;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import main.pojo.LoginUser;
//import main.pojo.Story;
//import main.pojo.Users;
//import main.repository.InfoRepository;
//import main.serviceImpl.InfoServiceImpl;
//
//@Repository
//public class InfoRepositoryImpl implements InfoRepository {
//	
//	private static final Logger logger = LoggerFactory.getLogger(InfoRepositoryImpl.class);
//	@Autowired
//	private SessionFactory sessionFactory;
//	@Override
//	public List<Users> getAllUsers() {
//		logger.info("entered getAllUsers");		
//		List<Users> userList = null;
//		final Session session = sessionFactory.getCurrentSession();
//		final Criteria criteria = session.createCriteria(Users.class, "u");
//		userList=criteria.list();
//		logger.info("exited getAllUsers");
//		return userList;
//	}
//
//	@Override
//	public void loginUser(LoginUser user) {
//		logger.info("entered loginUser");
//		logger.info("exited loginUser");
//	}
//
//	@Override
//	public List<Story> getStoriesWithSameReporter(String userId) {
//		logger.info("entered getStoriesWithSameReporter");
//		List<Story> storyList = null;
//		logger.info("exited getStoriesWithSameReporter");
//		return storyList;
//	}
//
//	@Override
//	public List<Story> getStoriesByAssignedUser(String userId) {
//		logger.info("entered getStoriesByAssignedUser");
//		List<Story> storyList = null;
//		logger.info("exited getStoriesByAssignedUser");
//		return storyList;
//	}
//
//}
