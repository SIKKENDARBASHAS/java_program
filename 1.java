import java.util.*;
class main
{
	static int plusmethod(int a,int b)
	{
		return a+b;
	}
	static float plusmethod(float c,float d)
	{
		return c+d;
	}
}
class sk
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	float c=sc.nextFloat();
	float d=sc.nextFloat();
	main myobj=new main();
	int mynum1=myobj.plusmethod(a,b);
	float mynum2=myobj.plusmethod(c,d);
	System.out.println("int:" + mynum1);
	System.out.println("float" + mynum2);
}
}