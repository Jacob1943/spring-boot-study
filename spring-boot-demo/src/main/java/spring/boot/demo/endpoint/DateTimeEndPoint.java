package spring.boot.demo.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jacob
 * @date 2019/10/8
 */
@Endpoint(id = "datetime")
@Component
public class DateTimeEndPoint {

    private String format = "yyyy-MM-dd HH:mm:ss";

    @ReadOperation
    public Map<String, Object> info() {

        Map<String, Object> info = new HashMap<>();
        info.put("datetime", new SimpleDateFormat(format).format(new Date()));
        return info;
    }

    @WriteOperation
    public void setFormat(String format) {
        this.format = format;
    }
}
