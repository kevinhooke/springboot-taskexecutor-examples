package kh.spring.beans.example3subclassbeaninstanceswiththreads;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class SubclassBeanInstancesWithThreadsApplicationConfiguration {
	
    @Bean
    public TaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(20);
        executor.setThreadNamePrefix("ExecutorThread_");
        executor.initialize();
        return executor;
    }
}
