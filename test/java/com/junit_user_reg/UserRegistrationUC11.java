package com.junit_user_reg;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationUC11 {

	private String email_test;					//global variables
	private boolean exp_val;
	private UserRegValidate checker;
	
	public UserRegistrationUC11(String email_test, boolean exp_val) {
		this.email_test = email_test;
		this.exp_val = exp_val;
	}
	
	@Parameterized.Parameters
	public static Collection TestCases() {
		return Arrays.asList(new Object[][] {
/**1**/		{"abc@yahoo.com",true},				//true cases
/**2**/		{"abc-100@yahoo.com",true},
/**3**/		{"abc.100@yahoo.com",true},
/**4**/		{"abc111@abc.com",true},
/**5**/		{"abc-100@abc.net",true},
/**6**/		{"abc.100@abc.com.au",true},
/**7**/		{"abc@1.com",true},
/**8**/		{"abc@gmail.com.com",true},
/**9**/		{"abc+100@gmail.com",true},
			
/**1**/		{"abc",false},				//false cases
/**2**/		{"abc@.com.my",false},
/**3**/		{"abc123@gmail.a",false},
/**4**/		{"abc123@.com",false},
/**5**/		{"abc123@.com.com",false},
/**6**/		{".abc@abc.com",false},
/**7**/		{"abc()*@gmail.com",false},
/**8**/		{"abc@%*.com",false},
/**9**/		{"abc..2002@gmail.com",false},
/**10**/	{"abc.@gmail.com",false},
/**11**/	{"abc@abc@gmail.com",false},
/**12**/	{"abc@gmail.com.1a",false},
/**13**/	{"abc@gmail.com.aa.au",false},
		});
	}

	@Test
	public void EmailTest() {					//initializing test
		checker=new UserRegValidate();
		boolean result=checker.validateEmail(email_test);
		Assert.assertEquals(exp_val, result);
	}
}