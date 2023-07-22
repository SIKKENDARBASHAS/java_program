import java.util.*;
class matrixaddsub
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
	a[i][j]=sc.nextInt();
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
if(i==0&&j==0)
{
	System.out.print( a[0][0]+a[0][2]-1);
}
else if(i==1&&j==0)
{
	System.out.print( a[1][0]+a[1][2]-1);
}
else if(i==2&&j==0)
{
System.out.print( a[2][0]+a[2][2]-1);
}
else if(i==0&&j==2)
{
System.out.print( a[0][2]-a[0][1]);
}
else if(i==1&&j==2)
{
System.out.print( a[1][2]-a[1][1]);
}
else if(i==2&&j==2)
{
System.out.print( a[2][2]-a[2][1]);
}
else
{
System.out.print( a[i][j]);
}
System.out.print(" ");
}
System.out.println();
}
}
}	