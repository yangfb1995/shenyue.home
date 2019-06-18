package com.shenyue.home;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 杨发丙
 * @Description:启动类
 * @return
 * @date 2019/6/17 20:00
 */
@SpringBootApplication
@MapperScan("com.shenyue.home.mapper")
public class HomeApplication {
    public static void main(String[] args) {
        SpringApplication.run(HomeApplication.class, args);
    }
}
