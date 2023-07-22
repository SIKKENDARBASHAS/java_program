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
class cse extends software
{
	void cs()
	{
		System.out.println("csc student");
	}
}
class it extends software
{
	void pro()
	{
		System.out.println("IT pro");
	}
}
class aids extends software
{
	void ai()
	{
		System.out.println("AIDS Student");
	}
}
class hirarchical
{
	public static void main(String args[])
	{
		aids a=new aids();
		it s=new it();
		cse c=new cse();
		engineer e=new engineer();
		a.ai();
		a.soft();
		s.pro();
		c.cs();
		e.eng();
	}
}