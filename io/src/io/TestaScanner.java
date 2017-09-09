package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaScanner {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		PrintStream ps = new PrintStream("print.txt");
		
		while(entrada.hasNextLine()) {
			ps.println(entrada.nextLine());
		}
	}
}
