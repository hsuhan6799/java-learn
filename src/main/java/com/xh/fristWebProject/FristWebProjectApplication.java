package com.xh.fristWebProject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xh.fristWebProject.mapper")
public class FristWebProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FristWebProjectApplication.class, args);
	}

}
