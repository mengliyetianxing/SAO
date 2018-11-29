package com.util;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsResponse;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.dysmsapi.transform.v20170525.SendSmsResponseUnmarshaller;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
 
public class SendCode {
	public static SendSmsResponse sendSms(String phoneNumber,String code) throws ClientException {
		System.setProperty("sun.net.client.defaultConnectTimeout", "10000");//不必修改
		System.setProperty("sun.net.client.defaultReadTimeout", "10000");//不必修改
	 	IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIzbHj6FhZanrD", "LeuCuFgF6GnAfGX5R7Vq0leaNWuieg");//"***"分别填写自己的AccessKey ID和Secret
		DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Dysmsapi", "dysmsapi.aliyuncs.com");//不必修改
		IAcsClient acsClient = new DefaultAcsClient(profile);//不必修改
		SendSmsRequest request = new SendSmsRequest();//不必修改
		request.setPhoneNumbers(phoneNumber);//****处填写接收方的手机号码
		request.setSignName("i油饼");//此处填写已申请的短信签名
		request.setTemplateCode("SMS_151910031");//此处填写获得的短信模版CODE
		request.setTemplateParam("{\"code\":\""+code+"\"}");//笔者的短信模版中有${code}, 因此此处对应填写验证码 
		SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);//不必修改
		return sendSmsResponse;
	}
	
	
	
	
}
