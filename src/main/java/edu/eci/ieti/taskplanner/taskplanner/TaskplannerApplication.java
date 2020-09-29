package edu.eci.ieti.taskplanner.taskplanner;

import edu.eci.ieti.taskplanner.taskplanner.models.User;
import edu.eci.ieti.taskplanner.taskplanner.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskplannerApplication implements CommandLineRunner{

	final UserService userService;

	public TaskplannerApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(TaskplannerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User("1", "Miguel", "miguel@email", "123");
		User u2 = new User("2", "Charlotte", "charlotte@email", "321");
		User u3 = new User("3", "Dante", "dante@email", "456");

		userService.createUser(u1);
		System.out.println("User 1 Created");
		userService.createUser(u2);
		System.out.println("User 2 Created");
		userService.createUser(u3);
		System.out.println("User 3 Created");
	}
}
