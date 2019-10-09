package spring.boot.demo.service;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import me.ye.springboot.service.SplitService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.boot.demo.config.DemoConfig;

/**
 * @author Jacob
 * @date 2019/10/9
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class SplitServiceTest {

    @Autowired
    private SplitService splitService;

    @Autowired
    private DemoConfig demoConfig;

    @Test
    public void testSplit() {
        log.info("split version: {}", JSON.toJSONString(
                splitService.spit(demoConfig.getVersion())
        ));
    }
}
