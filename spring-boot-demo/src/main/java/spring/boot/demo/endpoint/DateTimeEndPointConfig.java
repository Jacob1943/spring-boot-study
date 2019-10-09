package spring.boot.demo.endpoint;

import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jacob
 * @date 2019/10/8
 */
//@Configuration
public class DateTimeEndPointConfig {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnEnabledEndpoint
    public DateTimeEndPoint dateTimeEndPoint() {
        return new DateTimeEndPoint();
    }
}
