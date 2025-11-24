package br.com.techtaste.service_regitry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegitryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegitryApplication.class, args);
    }

}