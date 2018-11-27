package com.SAO;

import javax.mail.MessagingException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.util.Email;
import com.util.MD5;

public class Test {

	public static void main(String[] args) {
		try {
				Email.sendEmail("597137930@qq.com", "你这个沙雕");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
