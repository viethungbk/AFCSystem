package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
	public static ArrayList<String> readFile(String filePath) throws FileNotFoundException {
		ArrayList<String> data = new ArrayList<String>();

		File file = new File(filePath);
		String line = "";

		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			data.add(line);
		}
		scanner.close();
		return data;
	}
}
