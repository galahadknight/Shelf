package com.shelf.managedbean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.shelf.dao.User;
import com.shelf.ejb.UserEJB;

@ManagedBean
@ViewScoped
public class UserMB {

	@EJB 
	private UserEJB userEjb;
	
	private List<User> userList;

	public List<User> getUserList() {
		userList = userEjb.findAll();
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	} 
}
