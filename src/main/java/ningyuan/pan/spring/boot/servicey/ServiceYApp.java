package ningyuan.pan.spring.boot.servicey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import ningyuan.pan.spring.boot.servicey.config.ApplicationConfig;

@EnableEurekaClient
@SpringBootApplication
public class ServiceYApp {

	public static void main(String[] args) {
		SpringApplication bootstrap = new SpringApplication(ApplicationConfig.class);
		
		bootstrap.run(args);
	}

}
