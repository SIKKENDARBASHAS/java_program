import java.util.*;
class gcd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		gcd(n1,n2);
	}
	public static void gcd(int n1,int n2)
	{	
		if(n2==0)
		{
		System.out.print(n1);
		}
		else
		{
			gcd(n2,n1%n2);
		}
	}
}