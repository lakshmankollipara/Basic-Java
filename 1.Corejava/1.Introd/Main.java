class A
{
private int i;
A(int i)
{
this.i=i;
System.out.println("hello");
}
void display()
	{
	System.out.println(i);
	}
}
class B extends A
{
	private int i;
	B(int i)
	{
		//System.out.println(super(i));
		this.i=i;
	}
	void display()
	{
	System.out.println(i);
	}
}
class Main
{
public static void main(String args[])
	{
	B a=new B(10);
	a.display();
	}
}