package com.example.dependencyInjection;

import com.example.dependencyInjection.model.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionMain {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringDependencyInjectionMain.class, args);
		context.getBean(PersonDataView.class).view();
	}
}
