import java.util.*;
class matrixstar
{
	public static void main(String args[])
	{
	int a[][]=new int[3][3];
	for(int i=0;i<a.length();i++)
	{
		for(int j=0;j<a;j++)
		{
			a[i][j]=sl.nextInt();
			{
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
		{
		if(i==0&&j==1)
		{
			System.out.print(a[0][0]+a[0][1]+a[0][2]);
		}
		else if(i==0&&j==2)
		{
			System.out.print(a[0][1]-a[0][2]);
		}
		else if(i==1&&j==1)
		{
			System.out.print(a[1][1]-a[1][2]);
		}
		else if(i==1&&j==2)
		{
			System.out.print(a[1][1]+a[1][2]);
		}
		else if(i==2&&j==1)
		{
			System.out.print(a[2][1]+a[2][2]);
		}
		else if(i==2&&j==2)
		{
		System.out.print(a[2][1]+a[2][2]);
		}
		else
		{
			System.out.print("*");
		}
		System.out.print(" ");
		}
		System.out.println();
	}
}
		}
	}
	}
}
