package com.example.paramtestcontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Streams.class)
public class ParamTestContainerApplication {


	public static void main(String[] args) {
		SpringApplication.run(ParamTestContainerApplication.class, args);
	}

}
