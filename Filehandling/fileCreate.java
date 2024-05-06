package Filehandling;

import java.io.File;
import java.io.IOException;

public class fileCreate {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\DELL\\Desktop\\Divya.txt");

		try {
			if (f.createNewFile()) {
				System.out.println("File Succesfully Create");
			} else {
				System.out.println("File Already exist");
			}
		} catch (IOException i) {
			System.out.println("Exception Handled..!");
		}
	}
	// TODO Auto-generated method stub

}
//C:\\Users\\DELL\\Desktop\\Divya.txt
