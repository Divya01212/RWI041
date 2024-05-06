package Filehandling;

import java.io.File;

public class fileRename2 {

	public static void main(String[] args) {
		File originalname = new File("C:\\Users\\DELL\\Desktop\\Divya.txt");
		File rename = new File("C:\\Users\\DELL\\hartika.txt");
		if (originalname.exists()) {
			System.out.println(originalname.renameTo(rename) + " successfully changed name ");

		} else {
			System.out.println("not exsit");
		}

	}
}
