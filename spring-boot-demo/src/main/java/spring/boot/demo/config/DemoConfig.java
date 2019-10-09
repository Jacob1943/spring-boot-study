package spring.boot.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Jacob
 * @date 2019/10/8
 */
@Data
@Component
@ConfigurationProperties(prefix = "demo.springboot")
public class DemoConfig {

    private String version;
    private String name;
}
