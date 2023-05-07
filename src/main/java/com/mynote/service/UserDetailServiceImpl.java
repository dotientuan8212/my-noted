package com.mynote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mynote.entity.User;
import com.mynote.service.user.UserServiceImpl;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
	@Autowired
	private UserServiceImpl userService;

	@Override
=	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User userDetail = new User();
        Boolean enable = true;
        try {
            userDetail = userService.getUserByEmail(username);
        } catch (Exception e) {
            e.fillInStackTrace();
        }
         UserDetails userDetails = (UserDetails) new UserPrincipalCustom( userDetail, userDetail.getEmailAddress(), userDetail.getPassword(), enable);
        return userDetails;
	}

}
