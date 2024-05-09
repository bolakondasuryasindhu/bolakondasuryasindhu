public class Example6{
	
	int a=10;
	
	static int b=5;
	static void inc()
	{
		
		
		b++;
	}
	void ic1()
	{
		a++;
		
		b++;
	}
	public static void main(String[] args) {
	  Example11 ob=new Example11();
	  Example11 ob2=new Example11();
	  System.out.println(ob.a+"  "+b);
	  
	  inc();
	  System.out.println(ob.a+"  "+b);
	  ob.ic1();
	  System.out.println(ob.a+"  "+b);
	  System.out.println(ob2.a+" "+b);
	  
	}

}