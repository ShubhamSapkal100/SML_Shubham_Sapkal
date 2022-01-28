package Examples;
class pubaccessspecifiers {

	public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 
}

//create another package

public class defAccessSpecifierdefAccessModifierQ2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pubaccessspecifiers obj = new pubaccessspecifiers(); 
        obj.display(); 
	}

}
