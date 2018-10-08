package kh.spring.beans.example1beanwiththreads;

import org.springframework.stereotype.Component;

@Component
public class ExampleRunnable implements Runnable {
	
    @Override
    public void run() {

    	System.out.println(Thread.currentThread().getName() + " running: " + this.toString());
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
