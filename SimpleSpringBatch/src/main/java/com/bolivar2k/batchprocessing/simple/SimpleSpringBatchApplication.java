package com.bolivar2k.batchprocessing.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringBatchApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SimpleSpringBatchApplication.class, args);
		
		System.exit(SpringApplication.exit(SpringApplication.run(SimpleSpringBatchApplication.class, args)));
	}

}
