package com.zs.entity;

import java.util.Date;

/**
* 本地账号
* 
* @author zhushuai
* 创建日期 2019/10/23
* @since 
*/
public class LocalAuth {
	/**本地账号id*/
	private Long localAuthId;
	private String userName;
	private String password;
	/**用户id*/
	private Long userId;
	private Date createTime;
	private Date lastEditTime;
	private PersonInfo personInfo;

	public Long getLocalAuthId() {
		return localAuthId;
	}

	public void setLocalAuthId(Long localAuthId) {
		this.localAuthId = localAuthId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	@Override
	public String toString() {
		return "LocalAuth{" +
				"localAuthId=" + localAuthId +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", userId=" + userId +
				", createTime=" + createTime +
				", lastEditTime=" + lastEditTime +
				", personInfo=" + personInfo +
				'}';
	}
}
