package com.shelf.dao;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name="user", schema="db_shelf")
@NamedQuery(name="User.buscarTodos", query="SELECT u FROM User u")
public class User extends BaseDAO {

	private static final long serialVersionUID = 1L;
	
	@Column(name="LOGIN")
	private String login;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_CREATION")
	private Date dtCreation;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_LASTACCESS")
	private Date dtLastaccess;

	public User() {
	}

	public Date getDtCreation() {
		return this.dtCreation;
	}

	public void setDtCreation(Date dtCreation) {
		this.dtCreation = dtCreation;
	}

	public Date getDtLastaccess() {
		return this.dtLastaccess;
	}

	public void setDtLastaccess(Date dtLastaccess) {
		this.dtLastaccess = dtLastaccess;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}