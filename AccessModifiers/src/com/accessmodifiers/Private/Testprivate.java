package com.accessmodifiers.Private;

class Priv
{
	static private int dataValue=25;
	private void privateMethod()
	{
		System.out.println("private method from class Priv");
	}
	public void privateMemberAccess()
	{
		System.out.println("private variable of class Priv my value is = "+dataValue);
		this.privateMethod();
	}
}
public class Testprivate {

	public static void main(String[] args) {
		Priv privObj = new Priv();
		
		
      
	   
		//Accessing Private members of a class  //
		privObj.privateMemberAccess();
		
	}

}