package innerclass;

public class InnerclassAssisted1 {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		InnerclassAssisted1 obj=new InnerclassAssisted1();
		InnerclassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}


