package com.SAO;

import javax.mail.MessagingException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.util.Common;
import com.util.Email;
import com.util.MD5;

public class Test {

	public static void main(String[] args) {
		try {
				Email.sendEmail("962500050@qq.com", Common.getCode());
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
