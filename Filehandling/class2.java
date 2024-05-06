package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("C:\\Users\\DELL\\desktop\\hartika.txt");
			FileWriter fw = new FileWriter(f);

			try {
				fw.write("hartika is super hero");
			} finally {
				fw.close();
			}

			System.out.println("Data written to the file");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
