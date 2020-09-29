package com.junit_user_reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegValidate {
	
	private static final String fname_match = "[A-Z]{1}[a-zA-Z]{2,}";			//String pattern to be detected
	private static final String lname_match = fname_match;
	private static final String email_match = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	private static final String phone_match = "[0-9]{1,}\\s[1-9]{1}[0-9]{9}";
	private static final String pass_match = "((?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])).{8,}";
	
	public boolean validateFName(String fname) {
		Pattern pattern=Pattern.compile(fname_match);
		Matcher matcher=pattern.matcher(fname);
		boolean check=pattern.matcher(fname).matches();
		return check;
	}
	
	public boolean validateLName(String lname) {
		Pattern pattern=Pattern.compile(lname_match);
		Matcher matcher=pattern.matcher(lname);
		boolean check=pattern.matcher(lname).matches();
		return check;
	}
	
	public boolean validateEmail(String email) {
		Pattern pattern=Pattern.compile(email_match);
		Matcher matcher=pattern.matcher(email);
		boolean check=pattern.matcher(email).matches();
		return check;
	}
	
	public boolean validatePhone(String phone) {
		Pattern pattern=Pattern.compile(phone_match);
		Matcher matcher=pattern.matcher(phone);
		boolean check=pattern.matcher(phone).matches();
		return check;
	}
	
	public boolean validatePassword(String password) {
		Pattern pattern=Pattern.compile(pass_match);
		Matcher matcher=pattern.matcher(password);
		boolean check=pattern.matcher(password).matches();
		return check;
	}
}