package Examples;
class priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 
public class defAccessSpecifierdefAccessModifierQ2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//private
				System.out.println("Private Access Specifier");
				priaccessspecifier  obj = new priaccessspecifier(); 
		        //trying to access private method of another class 
		        //obj.display();

	}

}
