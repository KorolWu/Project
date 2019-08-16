package com.cowain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cowain.dao")
public class WmsGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(WmsGeneratorApplication.class, args);
	}
}
