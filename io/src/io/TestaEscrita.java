package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaEscrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("saida.txt", true); 
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String curso = "fj-22";
		bw.newLine();
		bw.write(curso);
		
		bw.close();
		
	}
}
