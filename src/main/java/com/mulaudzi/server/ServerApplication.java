package com.mulaudzi.server;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mulaudzi.server.enumeration.Status;
import com.mulaudzi.server.model.Server;
import com.mulaudzi.server.repository.ServerRepo;

@EnableWebMvc
@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args->{
			serverRepo.save(new Server(null, "192.168.1.160","Ubuntu Linux", "16 GB", "Personal PC",
					"http://localhost:8080/server/image/server1.png", Status.SERVER_UP)
					);
			serverRepo.save(new Server(null, "192.168.1.58","Fedora Linux", "16 GB", "Dell Tower",
					"http://localhost:8080/server/image/server1.png", Status.SERVER_UP)
					);
			serverRepo.save(new Server(null, "192.168.1.21","MS 2008", "32 GB", "Web Server",
					"http://localhost:8080/server/image/server1.png", Status.SERVER_UP)
					);
			serverRepo.save(new Server(null, "192.168.1.14","Red Hat Enterprise Linux", "64 GB", "Mail Server",
					"http://localhost:8080/server/image/server1.png", Status.SERVER_UP)
					);
		};
	}
}
