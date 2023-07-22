import java.util.*;
class mergearray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[] =new int[n];
		int b[] =new int[n];
		int len=a.length;
		int len1=b.length;
		int c[]=new int[len+len1];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();	
		}
		for( int i=0;i<n;i++)
		{
		c[i]=a.concat(b);
		System.out.print(c[i]);
		}
	}
}