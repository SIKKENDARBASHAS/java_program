import java.util.*;
class leetmax
{
	public static void main(String args[])
	{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				int next=-1;
				for(int j=i+1;j<n;j++)
				{
				if(a[i]<a[j])
				{
					next=a[j];
					System.out.println(next);
					break;
				}
				}
				if(i==n-1)
				{
					System.out.println("-1");
				}
			
			}
	}
}