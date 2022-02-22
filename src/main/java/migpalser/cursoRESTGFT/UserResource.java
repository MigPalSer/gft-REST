package migpalser.cursoRESTGFT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService udao;
	
	@GetMapping("/users")
	public List<User> users(){
		return udao.findAll();
	}
	
	@PostMapping("/users")
	@ResponseStatus(HttpStatus.CREATED)
	public void addUser(@RequestBody User user) {
		udao.save(user);
	}
	
	@GetMapping("/users/{id}")
	public User userById(@PathVariable int id){
		return udao.findOne(id);
	}
}
