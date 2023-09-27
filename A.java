public class A
{
	public A()
	{
		System.out.println("inside A() constructor !!!!");
	}
}


public class B extends A
{
	
	int i;
	
	public B()
	{
		
	System.out.println("inside B() constructor !!!");
	
	}
	
	public B(int i);
	{
	System.out.println("inside B(int i) constructor");
	
	this.i=i;
	}
}

public class C extends B
{
	public C()
	{
		System.out.println("inside C()  constructor ");
	}
}