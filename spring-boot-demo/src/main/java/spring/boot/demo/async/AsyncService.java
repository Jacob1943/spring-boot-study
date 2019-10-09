package spring.boot.demo.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author Jacob
 * @date 2019/10/8
 */
@Slf4j
@Component
public class AsyncService {

    @Async
    public void asyncProcess() throws InterruptedException {
        log.info("async process task, current thread name -> {}",
                Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(2);
    }

    @Async
    public Future<Integer> asyncProcessHasReturn() throws InterruptedException {
        log.info("async process task (has return), current thread name -> {}",
                Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(2);
        return new AsyncResult<>(100);
    }
}
