package com.hand.RWByteCharStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadByteStreamDemo01 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("hello.txt");
			byte input[] = new byte[5];
			fis.read(input);
			String inputString = new String(input,"UTF-8");
			System.out.println(inputString);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}