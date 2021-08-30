package com.tahauddin.syed.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "Users_Info_Tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsersInfo {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "USER_ID")
	    private int id;
		
		@Column(name = "USER_NAME")
	    private String userName;
	    
		@Column(name = "USER_PASSWORD")
	    private String password;
	    
		@Column(name = "USER_IS_ACTIVE")
	    private boolean active;
	    
		@Column(name = "USER_ROLE")
	    private String roles;

}
