package bg.proxiad.courses.web.model;

import java.util.Collection;

public interface UserService {
	Collection<User> listUsers();
	
	Long createUser(User user);
	
	User getUser(Long id);
	
	void updateUser(User user);
	
	void deleteUser(Long id);
}
