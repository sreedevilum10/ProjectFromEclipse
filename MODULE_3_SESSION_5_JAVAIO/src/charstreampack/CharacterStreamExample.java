package charstreampack;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
	public static void main(String[] args) {

		int charData;
		try (
				FileReader fr = new FileReader("D:\\luminar\\JAVA\\JAVABATCHES\\JavaAprilMay\\javaio\\charinput.txt");
				FileWriter fw = new FileWriter("D:\\luminar\\JAVA\\JAVABATCHES\\JavaAprilMay\\javaio\\charoutput.txt")) {

			while ((charData = fr.read()) != -1) {
				fw.write(charData);
				// typecast ASCII to character format
				//System.out.print((char) charData);
			}
			System.out.println("Text copied successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}