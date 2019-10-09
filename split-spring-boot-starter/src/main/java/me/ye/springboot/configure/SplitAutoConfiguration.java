package me.ye.springboot.configure;

import me.ye.springboot.service.SplitService;
import me.ye.springboot.service.impl.SplitServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jacob
 * @date 2019/10/9
 */
@Configuration
@ConditionalOnClass(value = {SplitService.class, SplitServiceImpl.class})
public class SplitAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    SplitService starterService() {
        return new SplitServiceImpl();
    }
}
