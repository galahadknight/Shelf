package com.shelf.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.shelf.dao.User;

@Stateless
@LocalBean
public class UserEJB {
	
	@PersistenceContext(name="shelfdb")
	private EntityManager entityMgr;
	private List<User> lstUsers;
	
	public List<User> findAll() {
		TypedQuery<User> query = entityMgr.createQuery("select u from User u", User.class);
		lstUsers = query.getResultList();
		
		return lstUsers;
	}
}
