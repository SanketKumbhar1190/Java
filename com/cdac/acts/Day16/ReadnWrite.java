package com.cdac.acts.Day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.Exception;


public class ReadnWrite {

	public static void main(String args[]) {

		try (
			BufferedReader br = new BufferedReader(new FileReader("example.txt"));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Dest.txt")))
			){

					String line;

					while((line = br.readLine()) != null) {
						pw.println(line);
					}
					System.out.println("File copied successfully.");

				} 
				catch (Exception e) {
					System.err.println("Error: " + e.getMessage());

				}
	}
}
