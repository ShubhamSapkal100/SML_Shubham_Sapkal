package Examples;
class proaccessspecifiers {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

//create another package
public class defAccessSpecifierdefAccessModifierQ2_3 extends proaccessspecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defAccessSpecifierdefAccessModifierQ2_3 obj = new defAccessSpecifierdefAccessModifierQ2_3();   
	       obj.display();  
	}

}
