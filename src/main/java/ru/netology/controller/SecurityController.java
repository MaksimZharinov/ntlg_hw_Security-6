package ru.netology.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/public")
	public String getPublic() {
		return "All users endpoint";
	}

	@GetMapping("/auth")
	public String getAuth() {
		return "Authenticated users endpoint";
	}

	@GetMapping("/admin")
	public String getAdmin() {
		return "Admin-only endpoint";
	}
}
