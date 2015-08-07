package com.hand.RWByteCharStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class RWCharStream {

	public static void main(String[] args) {
		File file = new File("hello.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			FileOutputStream fos = new FileOutputStream("newhello.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			char[] input = new char[10];
			int l = 0;
			while((l = isr.read(input)) != -1){
				System.out.println(new String(input,0,l));
				//String inputString = new String(input,0,l);
				osw.write(input,0,l);
			}
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