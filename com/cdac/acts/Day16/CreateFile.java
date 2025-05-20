package com.cdac.acts.Day16;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
		public static void main(String []args) {
			try(Scanner sc = new Scanner(System.in)){
				System.out.println("Enter file name:");
				String filename = sc.nextLine();
				File file = new File(filename);
				if(!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
}
