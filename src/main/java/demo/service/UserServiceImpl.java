package demo.service;

import demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("UserServiceImpl")
public class UserServiceImpl {

	@Autowired
	private UserDao userDao;


	@Transactional
	public void saveUser(String name) {
		userDao.saveUser(name);
	}

}