package Examples;
class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

public class defAccessSpecifierdefAccessModifierQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default
				System.out.println("Default Access Specifier");
				defAccessSpecifier obj = new defAccessSpecifier(); 		  
		        obj.display(); 


	}

}
