package me.ye.springboot.service.impl;

import me.ye.springboot.service.SplitService;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Jacob
 * @date 2019/10/9
 */
public class SplitServiceImpl implements SplitService {

    @Override
    public List<String> spit(String s) {
        return Stream.of(StringUtils.split(s, ","))
                .collect(Collectors.toList());
    }
}
