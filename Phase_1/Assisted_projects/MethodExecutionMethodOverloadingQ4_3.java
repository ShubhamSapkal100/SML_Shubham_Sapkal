package Examples;

public class MethodExecutionMethodOverloadingQ4_3 {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExecutionMethodOverloadingQ4_3 ob=new MethodExecutionMethodOverloadingQ4_3();
	       ob.area(111,111);
	       ob.area(11);  

	}

}
