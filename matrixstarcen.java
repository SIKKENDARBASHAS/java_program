import java.util.*;
class matrixstarcen
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
if(a[i][j]!=5)
{
System.out.print(" * ");	
}
else
{
	System.out.print(a[i][j]);
}
}
}
System.out.println();
}
}
}
