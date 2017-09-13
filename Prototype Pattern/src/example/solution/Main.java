package solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import solution.models.Conference;

public class Main {

	public static void main(String[] args) {
		System.out.println("Forneça o caminho absoluto do arquivo a ser processado: ");
		String path = "";
		try (Scanner scan = new Scanner(System.in)) {
			path = scan.next();
		} catch (Exception e) {
			System.out.println("Error Scanner: " + e.getMessage());
		}
		try {
			if (path.length() > 0) {
				String text = new String(Files.readAllBytes(Paths.get(path)));
				Conference conference = new Conference(text);
				conference.print();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}