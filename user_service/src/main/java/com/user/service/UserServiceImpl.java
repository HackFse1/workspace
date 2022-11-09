package com.user.service;


import java.util.List;

import org.springframework.stereotype.Service;
import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	List<User> list = List.of(
					new User(1311L, "Nishant", "9234567890"),
					new User(1323L, "Prasanna", "66764567890"),
					new User(1345L, "Vishal", "9234567890"),
					new User(1367L, "Uday", "9234567890"),
					new User(1373L, "Nilam", "9568967890"),
					new User(1389L, "Yash", "9234567890"),
					new User(1395L, "Sindhu", "2344567890")
			);
	
	
	
	
	@Override
	public User getUser(Long id) {
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
	
	

}
