package spring.boot.demo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Jacob
 * @date 2019/10/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties({"address"})
public class User {

    private String name;

    private int age;

//    @JsonIgnore
    private String address;

    @JsonProperty("rt")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date registerTime;
}
