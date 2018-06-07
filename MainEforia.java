package com.kerk12.eforia;

import java.io.IOException;
import java.io.RandomAccessFile;

public class MainEforia {
	
	private static RandomAccessFile raf1;
	private static RandomAccessFile raf2;
	private static RandomAccessFile raf3;
	private static RandomAccessFile raf4;
	

	private static String readString(int length, RandomAccessFile rafGiven) throws IOException{
		byte b[] = new byte[length];
		rafGiven.readFully(b);
		return new String(b);
	}
	
	public static void main(String[] args) throws IOException{
		
		raf1 = new RandomAccessFile("eforia.dbs","r");
		raf2 = new RandomAccessFile("details.dbs","rw");
		raf3 = new RandomAccessFile("codes.dbs","r");
		raf4 = new RandomAccessFile("xreos.dbs","r");
		
		int indCodes = 1;
		while ((indCodes - 1)*4 < (raf3.length())){
			long posCodes = (indCodes - 1)*4;
			long posNew = (indCodes - 1)*8;
			raf3.seek(posCodes);
			raf4.seek(posNew);
			
			int citToUpd = raf3.readInt();
			double newXreos = raf4.readDouble();
			
			long posInEforia = (citToUpd - 1)*(50+60+50+4);
			raf1.seek(posInEforia);
			
			String name = readString(50,raf1);
			String address = readString(60,raf1);
			String tel = readString(50,raf1);
			int indInDet = raf1.readInt();
			
			long posInDet = (indInDet - 1)*(8+18);
			raf2.seek(posInDet);
			raf2.writeDouble(newXreos);
			
			indCodes++;
		}
	}
}
