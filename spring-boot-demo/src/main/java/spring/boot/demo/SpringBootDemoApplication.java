package spring.boot.demo;


import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Jacob
 * @date 2019/10/7
 */
@EnableAsync
@EnableScheduling
@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootDemoApplication.class, args);


//        SpringApplication application =
//                new SpringApplication(SpringBootDemoApplication.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        application.setWebApplicationType(WebApplicationType.NONE);
//        application.run(args);

//        new SpringApplicationBuilder(SpringBootDemoApplication.class)
//                .bannerMode(Banner.Mode.OFF)
//                .web(WebApplicationType.NONE)
//                .run(args);
    }
}
