package com.kingpen.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.kingpen.dao.UserDao;
import com.kingpen.domain.User;
import com.kingpen.service.UserService;

/**  
 * ClassName:UserServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午2:47:41 <br/>       
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Transactional
	@Override
	public User findById(Integer id) {
		  
		return userDao.getById(id);
	}

	
}
  
