package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\DELL\\desktop\\divya.txt");
			FileWriter fw = new FileWriter(f);

			try {
				fw.write("divya is super hero");
			} finally {
				fw.close();
			}

			System.out.println("Data written to the file");
		} catch (IOException i) {
			System.out.println(i);
		}
	}
	// TODO Auto-generated method stub

}
