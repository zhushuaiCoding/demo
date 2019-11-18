package com.zs.entity;

import java.util.Date;

/**
* 
* 微信账号
* @author zhushuai
* 创建日期 2019/10/23
* @since 
*/
public class WechatAuth {
	/**微信id*/
	private Long wechatAuthId;
	/**用户id*/
	private Long userId;
	private String openId;
	/**创建时间*/
	private Date createTime;
	/**个人信息*/
	private PersonInfo personInfo;

	public Long getWechatAuthId() {
		return wechatAuthId;
	}

	public void setWechatAuthId(Long wechatAuthId) {
		this.wechatAuthId = wechatAuthId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	@Override
	public String toString() {
		return "WechatAuth{" +
				"wechatAuthId=" + wechatAuthId +
				", userId=" + userId +
				", openId='" + openId + '\'' +
				", createTime=" + createTime +
				", personInfo=" + personInfo +
				'}';
	}
}
