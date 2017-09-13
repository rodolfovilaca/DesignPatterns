package carTemplate;

public class Main {
	public static void main(String[] args) {

		Car ferrari = new Ferrari812();
		ferrari.drive();

		Car golf = new WolkswagenGolf();
		golf.drive();

		Car chevette = new ChevyChevette();
		chevette.drive();

	}
}
