package com.lulatto.utils;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {

	public static boolean isNumeric(String word) {
		boolean flag = false;
		Pattern pat = Pattern.compile("[^0-9,.\\s]");
		Matcher mat = pat.matcher(word);
		
		if(!mat.find()) {
			flag = true; 
		}
		return flag;
	}
		
	public static boolean isNull(String word) {
		boolean flag = false;
		if(word == null || word.trim().equals("")) {
			flag = true;
		}
		return flag;
	}
	
	public static boolean isNull(Object word) {
		boolean flag = false;
		if(word == null || word.equals("")) {
			flag = true;
		}
		return flag;
	}
	
	public static boolean isNull(Integer number) {
		boolean flag = false;
		if(number == null) {
			flag = true;
		}
		return flag;
	}
	
	public static boolean isNull(Long number) {
		boolean flag = false;
		if(number == null) {
			flag = true;
		}
		return flag;
	}
	
	public static boolean isNull(Date date) {
		boolean flag = false;
		if(date == null) {
			flag = true;
		}
		return flag;
	}
	
	public static boolean isOnlyLetters(String word) {
		boolean flag = false;
		Pattern pat = Pattern.compile("[^A-Za-z',.\\s]");
		Matcher mat = pat.matcher(word);
		if (!mat.find()) {
			flag = true;
		}
		return flag;
	}
}
