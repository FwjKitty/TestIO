package com.hand.RWByteCharStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteFile extends Thread{

	File file;
	int block;
	int lenght = 50;
	public WriteFile(File f,int b){
		this.file = f;
		this.block = b;
	}
	
	@Override
	public void run(){
		try {
			RandomAccessFile raf = new RandomAccessFile(file,"rw");
			raf.seek((block-1)*lenght);
			raf.writeBytes("This is block"+block);
			for(int i=0; i<20; i++){
				raf.writeBytes("-");
			}
			raf.writeBytes("\n");
			raf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}