package miu.edu.cs.cs425.lab12.eRegitrarSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ERegitrarSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ERegitrarSecurityApplication.class, args);
	}

}
