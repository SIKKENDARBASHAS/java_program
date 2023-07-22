import java.util.*;
class sort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		Arrays.sort(a);  
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(n>=2)
			{
				System.out.print(a[i])
			}
			else
			{
				System.out.print("invalid input");
			}
		}
	}
}
		