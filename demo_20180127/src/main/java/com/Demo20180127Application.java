package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @SpringBootApplication 默认扫描注解类的同级目录下的所有包
 * 一般把启动入口放在最外层的包路径下
 */
@ServletComponentScan
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Demo20180127Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo20180127Application.class, args);
	}
}
