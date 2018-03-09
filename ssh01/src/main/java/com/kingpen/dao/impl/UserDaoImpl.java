package com.kingpen.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.kingpen.dao.UserDao;
import com.kingpen.domain.User;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午2:46:09 <br/>       
 */
public class UserDaoImpl extends HibernateDaoSupport  implements UserDao {

	@Override
	public User getById(Integer id) {
		return getHibernateTemplate().get(User.class, id);  
	}

}
  
