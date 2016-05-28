package com.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.UserDetail;
@Repository
@Transactional
public class UserDaoImpl implements UserDao {
 @Autowired
 SessionFactory sessionFactory;
	public void addUser(UserDetail ud) {
        Session s=sessionFactory.openSession(); 
		Transaction tx=s.beginTransaction();
		s.save(ud);
		tx.commit();
		s.close();
		System.out.println("Success value is:"+ud.getUrole());
	}

}
