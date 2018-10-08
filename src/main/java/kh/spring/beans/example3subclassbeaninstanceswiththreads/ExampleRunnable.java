package kh.spring.beans.example3subclassbeaninstanceswiththreads;

/**
 * Subclass this base class, implement execute() for your custom logic,
 * then annotate subclass with @Component and @Scope("prototype") 
 * 
 * @author kevinhooke
 */
public abstract class ExampleRunnable implements Runnable {
	
	public abstract void execute();
	
    @Override
    public void run() {

    	System.out.println(Thread.currentThread().getName() + " base class running: " + this.toString());
    	this.execute();
    	System.out.println("\n");
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
