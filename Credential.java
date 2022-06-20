package com.hari.main;

import java.util.Random;

import com.hari.model.Employee;

public class Credential {
	public char[] generatepassword() {
		int length=8;
		String capitalCaseLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallCaseLetters="abcdefghijklmnopqrstuvwxyz";
		String specialCharacters="@#$%^&*";
		String numbers="1234567890";
		String combinedchars=capitalCaseLetters+smallCaseLetters+specialCharacters+numbers;
		Random random=new Random();
		char[] password=new char[length];
		for(int i=0; i<length; i++) {
			password[i]=combinedchars.charAt(random.nextInt(combinedchars.length()));
			}
		return password;
	}

public String generateEmailAddress(Employee emp,String dept) {
	return emp.getFirstname().toLowerCase()+emp.getLastname().toLowerCase()+"@"+dept+".abc.com";
}
public void showCredentials(Employee emp,String email) {
	System.out.println("Dear " + emp.getFirstname() + " your generated credentials are as fallows");
	System.out.println("Email-->"+email);
	System.out.print("password-->");
	System.out.println(generatepassword());
	}
}

