import java.util.*;
class software
{
	void soft()
	{
		System.out.println("MNC company");
	}
}
class engineer extends software
{
	void eng()
	{
		System.out.println("engineering student");
	}
}
class cse extends engineer 
{
	void cs()
	{
		System.out.println("csc student");
	}
}
class it extends cse
{
	void pro()
	{
		System.out.println("IT pro");
	}
}
class aids extends it
{
	void ai()
	{
		System.out.println("AIDS Student");
	}
}
class inheritancemp
{
	public static void main(String args[])
	{
		aids a=new aids();
		a.ai();
		a.pro();
		a.cs();
		a.eng();
		a.soft();
	}
}
	