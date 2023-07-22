import java.util.*;
class matrixadj
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
int a[][]=new int[2][2];
for(int i=0;i<a.length;i++)
{
for(int j=0;j<2;j++)
{
	a[i][j]=sc.nextInt();
}
}
System.out.print(a[1][1]);
System.out.print(-a[0][1]);
System.out.println();
System.out.print(-a[1][0]);
System.out.print(a[0][0]);
}
}
