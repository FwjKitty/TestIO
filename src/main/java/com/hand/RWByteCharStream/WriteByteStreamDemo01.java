package com.hand.RWByteCharStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class WriteByteStreamDemo01 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("hello.txt");
			String outputString = "write 2015-08-04写入文件";
			byte[] output = outputString.getBytes("UTF-8");
			fos.write(output);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}