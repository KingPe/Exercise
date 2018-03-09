package com.kingpen.web.action;

import com.kingpen.domain.User;
import com.kingpen.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午2:48:53 <br/>       
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User model = new User();
	private UserService userService;
	
	
	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@Override
	public User getModel() {
		return model;
	}
	
	public String findById(){
		model = userService.findById(model.getId());
		System.out.println(model.getId());
		return SUCCESS;
	}

}
  
