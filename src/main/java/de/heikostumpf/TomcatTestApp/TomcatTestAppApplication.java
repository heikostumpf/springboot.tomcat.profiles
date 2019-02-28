package de.heikostumpf.TomcatTestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TomcatTestAppApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TomcatTestAppApplication.class, args);
	}

}