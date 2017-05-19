package bg.proxiad.courses.web.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bg.proxiad.courses.web.model.User;
import bg.proxiad.courses.web.model.UserService;

@RestController
@RequestMapping(path = "/api/users")
public class UserApi {
	
	@Autowired
	private UserService userService;

    @GetMapping
    public Collection<User> listUsers() {
        return userService.listUsers();
    }

    @GetMapping(path = "{userId}")
    public User getUser(@PathVariable Long userId) {
        return userService.getUser(userId);
    }
    
    @PostMapping()
    public User createUser(User user) {
        return null;
    }
    
    @PutMapping(path = "{userId}")
    public void updateUser(User user) {
    }
}
