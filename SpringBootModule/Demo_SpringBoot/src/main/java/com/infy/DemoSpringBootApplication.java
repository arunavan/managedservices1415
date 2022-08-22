package com.infy;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication  // @Configuration ,@Componnetscan,@EnableAutoConfiguration
public class DemoSpringBootApplication  implements CommandLineRunner{

	//bbostrap application
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to CommandLineRunner");
	}


}
