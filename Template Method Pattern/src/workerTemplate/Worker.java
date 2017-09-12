package workerTemplate;

public abstract class Worker {
	public void work(){
		getUp();
		eat();
		goToWork();
		eat();
		goHome();
		sleep();
	}
	
	public abstract void getUp();
	public abstract void sleep();
	public abstract void goHome();
	public abstract void goToWork();
	public abstract void eat();
	
}
