package com.sks.learn.learnjpa.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sks.learn.learnjpa.entity.User;
import com.sks.learn.learnjpa.repository.UserRepository;

@Component
public class UserDaoRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserDaoRepositoryCommandLineRunner.class);

	@Autowired
	private UserRepository userRepo;

	@Override
	public void run(String... arg0) throws Exception {
		User user = new User("Repo", "Singh");
		userRepo.save(user);
		log.info("New User is created Thru Repo: " + user);

		Optional<User> userWithId = userRepo.findById(1L);
		log.info("User is retrieved : " + userWithId);

		List<User> userList = userRepo.findAll();
		log.info("All Users : " + userList);
	}
}