package com.practices.servlets;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileValidation {
	
	
	public boolean isValidMobile(String mobile) {
		Pattern p=Pattern.compile("[6-9] [0-9] {9}");
		//Pattern p = Pattern.compile("[6-9] [0-9] {9}");
		Matcher m=p.matcher("mobile");
		
	return m.matches();
	}
}
