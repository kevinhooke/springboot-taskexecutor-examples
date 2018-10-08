package kh.spring.beans.example3subclassbeaninstanceswiththreads;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ExampleSubclassRunnable extends ExampleRunnable{

	@Override
	public void execute() {
    	System.out.println(Thread.currentThread().getName() + " execute() in subclass: " + this.toString());

	}

}
