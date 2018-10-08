package kh.spring.beans.example1beanwiththreads;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

@Component
public class ExampleServiceImpl {

	@Autowired
	private TaskExecutor taskExecutor;
	
	@Autowired
	private ExampleRunnable example;

	@Autowired
	private ApplicationContext context;
	
	@PostConstruct
	public void init() {
		for(int i=0; i < 10; i++) {
			this.taskExecutor.execute(example);
		}
	}
	
}
