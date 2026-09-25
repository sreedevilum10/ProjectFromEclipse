package bytestreampack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int byteData;
		try {
			fis = new FileInputStream("D:\\luminar\\JAVA\\JAVABATCHES\\JavaAprilMay\\javaio\\input.txt");// read mode - read()
			//fos = new FileOutputStream("D:\\luminar\\JAVA\\JAVABATCHES\\JavaAprilMay\\javaio\\output.txt");// write()//read() It is used to return a character in ASCII form. It returns -1 at the end of file.
			fos = new FileOutputStream("D:\\luminar\\JAVA\\JAVABATCHES\\JavaAprilMay\\javaio\\output.txt",true); //true - means append the data not replace the data
			while ((byteData = fis.read()) != -1) { // while loop ->traverse
				fos.write(byteData);
			}
			System.out.println("File copied successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fis.close();
			fos.close();
		}
	}
}