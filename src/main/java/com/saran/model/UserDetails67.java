package com.saran.model;

import javax.persistence.*;

@Entity
@Table(name="user_det")
public class UserDetails67 {

	@Id @GeneratedValue
	@Column(name="USER_ID")
	private int userId;
	@Column(name="USER_NAME")
	private String userName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}