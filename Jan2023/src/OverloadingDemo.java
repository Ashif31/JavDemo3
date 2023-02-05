
public class OverloadingDemo {

	void hello()
	{
		System.out.println("Hello with no parameter");
		
	}
	void hello (int a)
	{
		System.out.println("Hello with para a: "+a);
	}
	void hello (int a , int b)
	{
		System.out.println("hello with a and b: "+a+","+b);
	}
}
