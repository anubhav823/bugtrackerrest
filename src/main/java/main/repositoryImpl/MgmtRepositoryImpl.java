//package main.repositoryImpl;
//
//import javax.persistence.PersistenceException;
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
//import main.pojo.Story;
//import main.pojo.Users;
//import main.repository.MgmtRepository;
//import main.serviceImpl.InfoServiceImpl;
//
//@Repository
//public class MgmtRepositoryImpl implements MgmtRepository {
//	
//	private static final Logger logger = LoggerFactory.getLogger(MgmtRepositoryImpl.class);
//	@Autowired
//	private SessionFactory sessionFactory;
//
//	@Override
//	public void registerNewUser(Users user) {
//		logger.info("entered registerNewUser");
//		final Session session = sessionFactory.getCurrentSession();
//		final Criteria criteria = session.createCriteria(Users.class, "u");
//		try {
//			session.save(user);
//		} catch (PersistenceException pe) {
//			pe.printStackTrace();
//		}
//		logger.info("exited registerNewUser");
//		
//	}
//
//	@Override
//	public void updateStoryById(final String storyid, final Story story) {
//		logger.info("entered updateStoryById");
//		
//		final Session session = sessionFactory.getCurrentSession();
//		final Criteria criteria = session.createCriteria(Story.class, "s");
//		criteria.add(Restrictions.eq("s.id", storyid));
//		logger.info("exited updateStoryById");
//		
//
//	}
//
//	@Override
//	public void createNewStory(final Story story) {
//		logger.info("entered createNewStory");
//		
//		final Session session = sessionFactory.getCurrentSession();
//		final Criteria criteria = session.createCriteria(Story.class, "s");
//		try {
//			session.save(story);
//		} catch (PersistenceException pe) {
//			pe.printStackTrace();
//		}
//		logger.info("exited createNewStory");
//		
//	}
//
//	@Override
//	public void deleteUserById(final String id) {
//		logger.info("entered deleteUserById");
//		
//		Users user = null;
//		final Session session = sessionFactory.getCurrentSession();
//		final Criteria criteria = session.createCriteria(Users.class, "u");
//		criteria.add(Restrictions.eq("u.id", id));
//		user = (Users) criteria.uniqueResult();
//		if (user != null) {
//			try {
//				session.delete(user);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		} else {
//			System.out.println("No User found");
//		}
//		logger.info("exited deleteUserById");
//		
//	}
//
//	@Override
//	public void updateUserById(final Users user, final String id) {
//		logger.info("entered updateUserById");
//		
//		final Session session = sessionFactory.getCurrentSession();
//		final Criteria criteria = session.createCriteria(Users.class, "u");
//		criteria.add(Restrictions.eq("u.id", id));
//		logger.info("exited updateUserById");
//		
//	}
//
//	@Override
//	public void deleteStoryById(String storyid) {
//		logger.info("entered deleteStoryById");
//		Story story = null;
//		final Session session = sessionFactory.getCurrentSession();
//		final Criteria criteria = session.createCriteria(Story.class, "s");
//		criteria.add(Restrictions.eq("s.storyid", storyid));
//		story = (Story) criteria.uniqueResult();
//		if (story != null) {
//			try {
//				session.delete(story);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		} else {
//			System.out.println("No User found");
//		}
//		logger.info("exited deleteStoryById");
//		
//	}
//}
