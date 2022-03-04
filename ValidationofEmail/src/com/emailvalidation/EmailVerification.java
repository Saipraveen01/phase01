package com.emailvalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerification {

	public static void main(String[] args) {
		
		
		String[] listOfEmails= {"Sai@gmail.com","Ganesh.p@gmail.com"};
		String trueExample="Sai@gmail.com",falseExample="sai.ch@gmail.com";
		
		//String trueExample=new Scanner(System.in).nextLine() to take input from user
		
		boolean a=emailVerification(trueExample, listOfEmails);
		boolean b=emailVerification(falseExample, listOfEmails);
		
		output(a);
		output(b);
		

	}
static boolean emailVerification(String email,String[] listOfEmails) {
	boolean flag=false;
	Pattern p = Pattern.compile(email);
	for(int i=0; i<listOfEmails.length; i++) {
		Matcher m =p.matcher(listOfEmails[i]);
		if(m.find()) {
			flag = true;
		}
	}
	return flag;
}

static void output(boolean result) {
	if(result)
		System.out.println("Email verification passed");
	else
		System.out.println("Email verification failed");
}
}