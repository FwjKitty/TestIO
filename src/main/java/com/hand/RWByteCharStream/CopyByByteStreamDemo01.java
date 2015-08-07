package com.hand.RWByteCharStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByByteStreamDemo01 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("hello.txt");
			FileOutputStream fos = new FileOutputStream("newhello.txt");
			byte[] input = new byte[10];
			while(fis.read(input) != -1){
				fos.write(input);
			}
			fos.close();
			fis.close();
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}