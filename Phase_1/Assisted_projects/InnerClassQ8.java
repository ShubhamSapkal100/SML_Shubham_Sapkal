package Examples;

public class InnerClassQ8 {

		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  


	public static void main(String[] args) {
		
		InnerClassQ8 obj=new InnerClassQ8();
		InnerClassQ8.Inner in=obj.new Inner();  
		in.hello();  
  
	


	}

}
