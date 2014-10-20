package com.tesco.gmoms.common;

import java.util.Vector;

public class Util {

	public static Vector<byte[]> consumeMemory(long mbSize) {
		Vector<byte[]> v = new Vector<byte[]>();
		
		int count = 0;
		while ( count < mbSize ) {
			byte b[] = new byte[1024*1024];
			v.add(b);
			count++;
		}
		
		Runtime rt = Runtime.getRuntime();
		System.out.println( "free memory: " + rt.freeMemory() + " Count = " + count);
		return v;
	}
}
