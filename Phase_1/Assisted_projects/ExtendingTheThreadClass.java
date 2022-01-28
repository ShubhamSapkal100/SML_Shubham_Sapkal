package Examples;

public class ExtendingTheThreadClass {
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
 		ExtendingTheThreadClass mt = new  ExtendingTheThreadClass();
  		mt.start();
 	}
}

