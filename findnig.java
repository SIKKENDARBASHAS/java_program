import java.util.*;
class finding
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
			Arrays.sort(a);
			for(int i=0;i<n;i++)
			{
				if(i==n-1)
				{
					System.out.print(a[i]);
				}
			}
	}
}
				