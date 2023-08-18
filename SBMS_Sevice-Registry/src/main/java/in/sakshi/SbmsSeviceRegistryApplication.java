package in.sakshi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbmsSeviceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsSeviceRegistryApplication.class, args);
	}

}
