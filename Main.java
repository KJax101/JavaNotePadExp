package Q20NotePadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> lines = new ArrayList<String>();
		File file = new File("src/Q20NotePadFile/Data.txt");
		
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				lines.add(sc.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<String[]> output = new ArrayList<String[]>();
		
		for(String str : lines) {
			output.add(str.split(":"));
		}
		for(String[] list : output) {
			System.out.println("Name: " + output.get(output.indexOf(list))[0]);
			System.out.println("Age: " + output.get(output.indexOf(list))[1]);
			System.out.println("State: " + output.get(output.indexOf(list))[2]);
			System.out.println();
		}
		
		
	}
}
