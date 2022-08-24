package com.nseit.springboot_todo_jpa;

import com.nseit.springboot_todo_jpa.model.Todo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootTodoJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTodoJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


}
}
