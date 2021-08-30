package com.tahauddin.syed.security;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetails implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9167739775720927598L;
	
	
	private String userName;
	
	public MyUserDetails() {
	}
	
	public MyUserDetails(String userName) {
		this.userName = userName;
	}
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("ADMIN"));
	}

	@Override
	public String getPassword() {
		return "password";
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
