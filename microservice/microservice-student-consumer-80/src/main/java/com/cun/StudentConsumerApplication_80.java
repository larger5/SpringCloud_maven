package com.cun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

//这里的话 加了特殊配置 排除了 数据源注入，不加的话 会报错，老版本没有这个问题；
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class StudentConsumerApplication_80 {
 
    public static void main(String[] args) {
        SpringApplication.run(StudentConsumerApplication_80.class,args);
    }
}
