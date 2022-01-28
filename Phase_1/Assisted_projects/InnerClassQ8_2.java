package Examples;

public class InnerClassQ8_2 {
	private String msg="Hello Gamer";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassQ8_2  ob=new InnerClassQ8_2();  
		ob.display();  


	}

}
