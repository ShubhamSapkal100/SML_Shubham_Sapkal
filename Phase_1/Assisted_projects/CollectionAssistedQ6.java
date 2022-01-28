package Examples;
import java.util.*;
public class CollectionAssistedQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Pune");//
	      city.add("Mumbai");    	   
	      System.out.println(city);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(1); 
	      vec.addElement(2); 
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Shubham");  
	      names.add("Sapkal");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(1);  
	       set.add(2);  
	       set.add(3);
	       set.add(4);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);

	      }
	}

}
