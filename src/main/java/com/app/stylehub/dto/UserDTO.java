package com.app.stylehub.dto;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.app.stylehub.entities.UserRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import lombok.*;


public class UserDTO {
	
	@JsonProperty(access = Access.READ_ONLY)
    private Long userId;
	
	@NotBlank(message = "First Name required")
    private String firstName;
    private String lastName;
    private String phoneNo;
    
    @Email(message = "Invalid Email!!!")
    private String email;
    @JsonProperty(access = Access.WRITE_ONLY)
    private String password;

    private UserRole role;
    private AddressDTO address;
    
    public UserDTO() {
		
	}
   
    public UserDTO(String firstName, String lastName,String phoneNo,String email, String password, UserRole role, AddressDTO address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.password = password;
		this.role = role;
		this.address = address;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
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

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
    
    
}
