import java.util.*;
class add2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]={5,7,1,2,8,4,3};
		int RES=0;				
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(n==a[i]+a[j])
				{
					RES=1;
					System.out.println(a[i]+"+"+ a[j] +"+"+ n);
				}
			}
		}
		if(RES==1)
		{
			System.out.println("target found");
		}
		else
		{
			System.out.println("no target found");
		}
	}
}