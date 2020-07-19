package me.syurue.demospring51;

import me.syureu.out.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

import java.util.function.Supplier;

@SpringBootApplication
public class Demospring51Application {

    @Autowired
    MyService myService;

    public static void main(String[] args) {
        //SpringApplication.run(Demospring51Application.class, args);
        var app = new SpringApplication(Demospring51Application.class);
        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
            if(true) {
                ctx.registerBean(MyService.class);
            }
            if (true) {
                ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition."));
            }
        });
        app.run(args);
    }

}