package Examples;
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class ParameterizedconstructorQ5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Std std1=new Std(1,"Parameterized");
		Std std2=new Std(2,"constructor");
		std1.display();
		std2.display();


	}

}
