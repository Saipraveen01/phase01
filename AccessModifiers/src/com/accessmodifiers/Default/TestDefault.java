//** PROGRAM TO ILLUSTRATE ACCESS OF MEMBERS DECLARED  WITH DEFAULT ACCESS MODIFIer 

package com.accessmodifiers.Default;

class Def
{
	static int dataValue=15;
	void defaultMethod()
	{
		System.out.println("default method from class Def");
	}
}

public class TestDefault {

	public static void main(String[] args) {
		
		System.out.println("default variable of class Def my value is = "+Def.dataValue);// Accessing datavalue variable of class Def having default access modifier within the same package
    
		Def defObj = new Def(); // creating an Instance of Def class to call instance method testDefault()
    
		defObj.defaultMethod(); // Accessing instance method defaultMethod() of class Def having default accessmodifier within the same package
	}

}