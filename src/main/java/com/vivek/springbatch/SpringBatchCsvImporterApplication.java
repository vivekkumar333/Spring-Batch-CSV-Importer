package com.vivek.springbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchCsvImporterApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBatchCsvImporterApplication.class);
 
	public static void main(String[] args) {
		
		LOGGER.info("Application Started ..........");
		
		SpringApplication.run(SpringBatchCsvImporterApplication.class, args);
	}

}
