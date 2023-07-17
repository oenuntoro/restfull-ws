package com.oen.rest.ws.restfullws.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoServices {
	
	public static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"Oen1", LocalDate.now().minusYears(30)));
		users.add(new User(2,"Oen2", LocalDate.now().minusYears(31)));
		users.add(new User(3,"Oen3", LocalDate.now().minusYears(32)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id){
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public User save(User user) {
		user.setId(users.size()+1);
		users.add(user);
		return user;
		
	}

}
