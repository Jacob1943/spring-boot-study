package spring.boot.demo.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.demo.config.DemoConfig;
import spring.boot.demo.vo.User;

import java.util.Date;

/**
 * @author Jacob
 * @date 2019/10/8
 */
@Slf4j
@RestController
@RequestMapping("/springboot")
public class Controller {

    @Value("${demo.springboot.version}")
    private String version;
    @Value("${demo.springboot.name}")
    private String name;

    private DemoConfig demoConfig;
    private final ObjectMapper mapper;

    @Autowired
    public Controller(DemoConfig demoConfig, ObjectMapper mapper) {
        this.demoConfig = demoConfig;
        this.mapper = mapper;
    }

    @GetMapping("conf_inject")
    public void confInject() {
        log.info("version, name: {}, {}", version, name);
    }

    @GetMapping("conf_inject_2")
    public void confInject2() {
        log.info("version, name: {}, {}", demoConfig.getVersion(), demoConfig.getName());
    }

    @GetMapping("/jackson")
    public User jackson() throws Exception {

        User user = User.builder()
                .name("Jacob")
                .age(17)
                .address("Guangzhou")
                .registerTime(new Date())
                .build();

        String jsonUser = mapper.writeValueAsString(user);
        log.info("user jackson: {}", jsonUser);

        //return mapper.readValue(jsonUser, User.class);
        return user;
    }
}
