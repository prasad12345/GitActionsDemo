package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHUbActionsDemoApplication {
	
	
	@GetMapping("/welcome")
	public String displayMessage() {
		return "Displaying the messagers";
	}

	
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/prasad12345/GitActionsDemo.git
//	git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(GitHUbActionsDemoApplication.class, args);
	}

}
