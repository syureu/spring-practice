package me.syurue.demospring51;

import me.syureu.out.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demospring51Application {

    @Autowired
    MyService myService;

    public static void main(String[] args) {
        SpringApplication.run(Demospring51Application.class, args);
    }

}
