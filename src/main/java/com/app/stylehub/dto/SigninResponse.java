package com.app.stylehub.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class SigninResponse {
	private String jwt;
	private String mesg;
	//edited 
	private UserDTO user;
	
	public SigninResponse() {
		
	}

	public SigninResponse(String jwt, String mesg, UserDTO user) {
		super();
		this.jwt = jwt;
		this.mesg = mesg;
		this.user = user;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public String getMesg() {
		return mesg;
	}

	public void setMesg(String mesg) {
		this.mesg = mesg;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
	
	
}
