package Examples;
	class UsesOfPolymorphism
	{
	    public int suUsesOfPolymorphism(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    public int UsesOfPolymorphism(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	    public double UsesOfPolymorphism(double x, double y) 
	    { 
	        return (x + y); 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsesOfPolymorphism s = new UsesOfPolymorphism(); 
        System.out.println(s.UsesOfPolymorphism(10, 20)); 
        System.out.println(s.UsesOfPolymorphism(10, 20, 30)); 
        System.out.println(s.UsesOfPolymorphism(10.5, 20.5)); 

	}

}
