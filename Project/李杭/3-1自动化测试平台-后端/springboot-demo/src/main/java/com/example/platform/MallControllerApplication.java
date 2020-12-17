package com.example.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class MallControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallControllerApplication.class, args);
    }

}
