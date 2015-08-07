package com.hand.RWByteCharStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RWByBufferedCharStream {

	public static void main(String[] args) {
		File file = new File("hello.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			FileOutputStream fos = new FileOutputStream("newhello.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(osw,true);
			String input;
			while((input = br.readLine()) != null){
				System.out.println(input);
				bw.write(input);
				pw.write(input);
			}
			bw.flush();
			pw.flush();
			br.close();
			bw.close();
			pw.close();
			isr.close();
			fis.close();
			osw.close();
			fos.close();
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
