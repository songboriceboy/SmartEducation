package com.hhit.entity;

//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : QQLoginInfo.java
//  @ Date : 2016/4/1
//  @ Author : 
//
//

public class QQLoginInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String accessToken;
	private String openId;
	private String nikeName;
	private String gender;
	private String birthPlace;
	private Integer birthYear;
	private String figureUrl;
	private User user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getNikeName() {
		return nikeName;
	}

	public void setNikeName(String nikeName) {
		this.nikeName = nikeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public String getFigureUrl() {
		return figureUrl;
	}

	public void setFigureUrl(String figureUrl) {
		this.figureUrl = figureUrl;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
