package com.accessmodifiers.Proct2;

import com.accessmodifiers.Proct1.Testprotected1;

class Subprotectedclass extends Testprotected1
{
	public void accessProtectedMembers()
	{
		System.out.println("protected member of class Protectedclass my value is = "+dataValue);
		this.protectedMethod();
	}
}
public class Testprotected2 {

	public static void main(String[] args) {
		
		Testprotected1 protectedClassObj = new Testprotected1();//creating Protectedclass instance
		Subprotectedclass subProtectedClassObj = new Subprotectedclass();//creating Subprotectedclass instance
		
		
		 
		 subProtectedClassObj.accessProtectedMembers();
		
	}

}