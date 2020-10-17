package me.syureu.demospring201018;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        while(true) {
            System.out.println(Locale.getDefault());
            System.out.println(messageSource.getMessage("greeting", new String[]{"Syureu"}, Locale.getDefault()));
            System.out.println(messageSource.getMessage("greeting", new String[]{"Syureu"}, Locale.US));
            System.out.println(messageSource.getMessage("greeting", new String[]{"Syureu"}, Locale.KOREA));

            System.out.println(applicationContext.getMessage("greeting", new String[]{"Syureu"}, Locale.KOREA));
            Thread.sleep(1000);
        }
    }
}
