package Examples;

public class MethodExecutioncallbyValueQ4_2 {

int val=150;

int operation(int val) {
	val =val*10/100;
	return(val);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExecutioncallbyValueQ4_2 d = new MethodExecutioncallbyValueQ4_2();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);

	}

}