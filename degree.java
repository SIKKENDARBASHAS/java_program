import java.util.*;
class degree
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int s=sc.nextInt();
	int a[][]=new int[n][n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	if(s==1)
	{
	for(int j=n-1;j>=0;j--)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
	}
	else if(s!=1)
	{
	for(int j=0;j<n;j++)
	{
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
	}
}
}