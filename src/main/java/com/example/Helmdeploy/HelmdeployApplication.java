package com.example.Helmdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelmdeployApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelmdeployApplication.class, args);
	}
	@GetMapping("/helm")
	public String hello() {

		return "Hello, Kubernetes!";
	}

}
