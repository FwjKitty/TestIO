package com.hand.RWByteCharStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) {
		try {
			//用于读取以字符为基准的文件，若文件存储的是纯文本数据，则用FileReade
			//对于原始的字节流，建议使用FileInputStream
			FileReader fr = new FileReader("hello.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("newhello.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			String line;
			while((line = br.readLine()) != null){
				bw.write(line+"\n");
			}
			bw.flush();
			bw.close();
			fw.close();
			br.close();
			fr.close();
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}