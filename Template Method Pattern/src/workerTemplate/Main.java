package workerTemplate;

public class Main {
	public static void main(String[] args) {
		Worker  developer  = new Developer();
		developer.work();
		
		Worker businessMan = new BusinessMan();
		businessMan.work();
		
		Worker designer = new GraphicDesiner();
		designer.work();
		
	}
}
