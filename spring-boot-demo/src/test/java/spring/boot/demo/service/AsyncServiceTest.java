package spring.boot.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.boot.demo.async.AsyncService;

import java.util.concurrent.Future;

/**
 * @author Jacob
 * @date 2019/10/8
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class AsyncServiceTest {

    @Autowired
    private AsyncService asyncService;

    @Test
    public void testAsyncProcess() throws InterruptedException {

        asyncService.asyncProcess();
        log.info("coming in testAsyncProcess...");
    }

    @Test
    public void testAsyncProcessHasReturn() throws Exception {

        long start = System.currentTimeMillis();

        Future<Integer> result = asyncService.asyncProcessHasReturn();
        log.info("get async task value: {}", result.get());
        log.info("time elapse for async task: {}ms", System.currentTimeMillis() - start);
    }
}
