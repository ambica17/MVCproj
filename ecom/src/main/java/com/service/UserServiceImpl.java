package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DAO.UserDao;
import com.model.UserDetail;
@Service
@Transactional
public class UserServiceImpl implements UserService {
@Autowired
	UserDao udi;
	public void addUser(UserDetail ud) {
		udi.addUser(ud);
		
	}

}
