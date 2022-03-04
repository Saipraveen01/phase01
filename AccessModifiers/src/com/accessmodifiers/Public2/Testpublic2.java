package com.accessmodifiers.Public2;
import com.accessmodifiers.Public1.Testpublic1;

public class Testpublic2 {

	public static void main(String[] args) {
		Testpublic1 publicClassObj = new Testpublic1();
		   
	       System.out.println("public variable of class Testpublic2 my value is = "+Testpublic1.dataValue);
	       publicClassObj.publicMethod();

	}

}