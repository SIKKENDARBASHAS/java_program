import java.util.*;
class merge
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int mid=n/2;
int a[]=new int[n];
int l[]=new int[mid];
int r[]=new int[n-mid];
for(int i=0;i<mid;i++)
{
	l[i]=a[i];
}
for(int i=mid;i<n;i++)
{
	r[i-mid]=a[i];
	System.out.print(a[i]);
}
}
}
