package Filehandling;

//copy content/data one file to another file 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class copyContent {
	public static void main(String[] args) {
		try (FileInputStream read = new FileInputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\Divya.txt");
				FileOutputStream writecopy = new FileOutputStream("C:\\\\Users\\\\DELL\\\\desktop\\\\hartika.txt")) {

			int i;
			while ((i = read.read()) != -1) {
				writecopy.write(i);
			}

			System.out.println("Data copied successfully");
		} catch (IOException e) {
			System.out.println("Exception handled: " + e);
		}
	}
}
//C:\\Users\\DELL\\Desktop\\Divya.txt
//C:\\Users\\DELL\\hartika.txt