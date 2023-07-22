import java.util.*;
class hlheart
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0&&j==2||i==0&&j==6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			for(int i=0;i<n;i++)
			{
			for(int j=0;j<n;j++)
			{
				if(i==1&&j==1||i==1&&j==3||i==1&&j==5||i==1&&j==7)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
}
}
}
		
					