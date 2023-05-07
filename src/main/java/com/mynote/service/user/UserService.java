package com.mynote.service.user;

import com.mynote.entity.User;
import com.mynote.exception.HandlerException;

public interface UserService {
	User getUserByEmail(String email) throws HandlerException;

    void insertUser(User user) throws HandlerException;
}
