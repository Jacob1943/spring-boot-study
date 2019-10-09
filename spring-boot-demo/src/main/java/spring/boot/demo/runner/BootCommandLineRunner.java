package spring.boot.demo.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Jacob
 * @date 2019/10/8
 */
@Order(1)
@Slf4j
@Component
public class BootCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("This is BootCommandLineRunner...");
    }
}
