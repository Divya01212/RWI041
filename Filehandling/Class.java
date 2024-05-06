package Filehandling;

import java.io.File;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\DELL\\desktop\\divya.txt");
		if (f.exists()) {
			System.out.println("File Name =" + f.getName());
			System.out.println("File Path=" + f.getAbsolutePath());
			System.out.println("File write =" + f.canWrite());
			System.out.println("File length =" + f.length());
			System.out.println("File Read =" + f.canRead());
			System.out.println("File Remove =" + f.delete());

		} else {
			System.out.println("File does not exist ");
		}

	}
}
