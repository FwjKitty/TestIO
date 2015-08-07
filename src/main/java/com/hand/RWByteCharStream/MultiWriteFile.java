package com.hand.RWByteCharStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MultiWriteFile {

	static File file = new File("hello.txt");
	public static void main(String[] args) {
		/*if(file.exists()){
			file.delete();
		}
		new WriteFile(file,4).start();
		new WriteFile(file,5).start();
		new WriteFile(file,6).start();
		new WriteFile(file,1).start();
		new WriteFile(file,2).start();
		new WriteFile(file,3).start();*/
		
		try {
			RandomAccessFile raf = new RandomAccessFile(file,"r");
			raf.seek(250);
			byte[] str = new byte[20];
			raf.read(str);
			String inStr = new String(str);
			System.out.println(inStr);
			raf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}