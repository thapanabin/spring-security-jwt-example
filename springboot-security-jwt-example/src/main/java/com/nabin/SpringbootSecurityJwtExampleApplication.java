package com.nabin;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nabin.jwt.api.entity.User;
import com.nabin.jwt.api.repository.UserRepository;

@SpringBootApplication
public class SpringbootSecurityJwtExampleApplication {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void initUsers() {
		List<User>users = Stream.of(
				new User(100,"nabin","nabin123","nabinthapant@hotmail.com"),
				new User(101,"kabin","nabin123","nabinthapant@hotmail.com"),
				new User(102,"sabin","nabin123","nabinthapant@hotmail.com"),
				new User(103,"babin","nabin123","nabinthapant@hotmail.com")).collect(Collectors.toList());
		userRepository.saveAll(users);
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityJwtExampleApplication.class, args);
	}

}
