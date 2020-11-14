package me.syureu.demospring201018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Demospring201018Application {

    public static void main(String[] args) {
        SpringApplication.run(Demospring201018Application.class, args);
    }

}
