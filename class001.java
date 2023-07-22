import java.util.*;
class class001
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m= sc.nextInt();   
		int n = sc.nextInt();   
		int a[][] = new int[m][n]; 
		for (  int k= 0; k<a.length; k++) 
		{			
		for ( int j = 0; j<a.length; j++)
		{			
		a[3][3] = sc.nextInt(); 
		}		
		System.out.println("Elements of the array are: ");   
		for( int i=0;i<a.length;i++)
		{
			for(  int j=0;j<a.length;i++)
			{
				if(i==0&&j==0)
				{
					System.out.print(a[0][0]+a[1][1] +"");
				}
				else if(i==0&&j==1)
				{
					System.out.print(a[0][0]+a[1][1] +" ");
				}
				else if(i==0&&j==3)
				{
					System.out.print(a[1][1]+a[0][3] +" ");
				}
				else if(i==1&&j==0)
				{
					System.out.print(a[1][0]+a[2][1] +" ");
				}
				else if(i==1&&j==1)
				{
					System.out.print(a[1][1] +" ");
				}
				else if(i==1&&j==2)
				{
					System.out.print(a[0][1]+a[1][2] +" ");
				}
				else if(i==2&&j==0)
				{
					System.out.print(a[1][1]+a[2][0] +" ");
				}
				else if(i==2&&j==1)
				{
					System.out.print(a[1][2]+a[2][1] +" ");
				}
				else if(i==2&&i==2)
				{
					System.out.print(a[1][1]+a[2][2] +" ");
				}
				else 
				{
					System.out.print("");
				}
			}
		}
		System.out.println();
	}
}
}