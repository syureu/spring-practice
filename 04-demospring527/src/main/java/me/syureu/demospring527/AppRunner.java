package me.syureu.demospring527;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    BookRepository bookRepository;
    // Project Run Configuration에서 test라는 Profile을 적용하게 설정해준다면 에러없이 가동된다.
    // IDE가 이러한 옵션을 주지 않는 경우 VM option에 -Dspring.profiles.active="test" 와 같은 인수를 주면 된다.

    // Configuration을 작성하면 오토스캔이 아닌 수동 빈 등록이라 귀찮다.
    // 컴포넌트 어노테이션과 함께 프로파일 어노테이션을 작성해주면 프로파일 적용이 가능하다.

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = ctx.getEnvironment();
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));

        System.out.println(environment.getProperty("app.name"));
        System.out.println(environment.getProperty("app.about"));
    }
}
