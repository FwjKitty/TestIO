package com.hand.RWByteCharStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadByBufferedBytesStream {
	
	public static void main(String[] args) {
		try {
			//带缓冲的字节流读取文件更加高效
			FileInputStream fis = new FileInputStream("hello.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			FileOutputStream fos = new FileOutputStream("newhello.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte[] input = new byte[10];
			int count = 0;
			System.out.println(System.currentTimeMillis());
			while(bis.read(input) != -1){
				bos.write(input);
				count++;
			}
			bis.close();
			fis.close();
			bos.close();
			fos.close();
			System.out.println(System.currentTimeMillis());
			System.out.println("读取了 "+count+" 次");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}