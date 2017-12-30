package com.wonderstree.secure.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {

	@Id
	@Column(name="Id")
	private long id;
	@Column(name="Email",unique=true,nullable=false)
	private String email;
	@Column(name="Password",nullable=false)
	private String password;
	
	
	
	
	
	
	public Vendor() {	}
	
	
	
	public Vendor(long id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
