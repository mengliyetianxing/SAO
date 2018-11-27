package com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public final class Common {
	private Common() {
		
	}
	//产生六位随机数
	public static String getCode() {
		String ssr = "";
		Random r = new Random();
		String base="0123456789qwertyuiopasdfghjklzxcvbnm";
		for (int i = 0; i < 6; i++) {
		ssr += base.charAt(r.nextInt(base.length()));
		}
		return ssr;
	}
	
}
