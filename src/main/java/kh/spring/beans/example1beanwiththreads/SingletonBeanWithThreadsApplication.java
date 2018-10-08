package kh.spring.beans.example1beanwiththreads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonBeanWithThreadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonBeanWithThreadsApplication.class, args);
	}
}
