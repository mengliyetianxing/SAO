package com.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;

public final class MD5 {
   
	private MD5() {
		
	}
	
    public static String md5(String str){
    	if(str!=null)
        return DigestUtils.md5Hex(str);
    	return null;
    }
}
