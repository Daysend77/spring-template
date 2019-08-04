package demo.dao;

import demo.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao  {

	@Autowired
	private SessionFactory sessionFactory;


	public void saveUser(String name){
		User user = new User(name);
		sessionFactory.getCurrentSession().save(user);
	}


}