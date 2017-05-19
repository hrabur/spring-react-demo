package bg.proxiad.courses.web.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	private Collection<User> users = new ArrayList<>();
	private Long nextId = 5L;
	
	@PostConstruct
	public void initUsers() {
		users.add(new User(1L, "Niki", "niki@proxiad.com"));
		users.add(new User(2L, "Gosho", "gosho@proxiad.com"));
		users.add(new User(3L, "Pesho", "pesho@proxiad.com"));
		users.add(new User(4L, "Tosho", "tosho@proxiad.com"));
	}

	@Override
	public Collection<User> listUsers() {
		return users;
	}

	@Override
	public Long createUser(User user) {
		user.setId(nextId);
		nextId++;
		return nextId;
	}

	@Override
	public User getUser(Long id) {
		for (User user : users) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

}
