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
class it extends engineer
{
	void pro()
	{
		System.out.println("IT pro");
	}
}
class hybrid
{
	public static void main(String args[])
	{
		it a=new it();
		a.pro();
	}
}