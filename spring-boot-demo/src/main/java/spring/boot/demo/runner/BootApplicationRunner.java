package spring.boot.demo.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Jacob
 * @date 2019/10/8
 */
@Order(2)
@Slf4j
@Component
public class BootApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("This is BootApplicationRunner...");
    }
}
