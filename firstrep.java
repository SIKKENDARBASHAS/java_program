import java.util.*;
class firstrep
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int res=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j]&&i!=a[j])
				{
					break;
				}
				if(j==n)
				{
					res=a[i];
				}
			}
		}
		System.out.print(res);
	}
}