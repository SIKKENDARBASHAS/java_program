import java.util.*;
class max2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
int temp=0;
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	System.out.println(a[i]);
}
System.out.println(a[a.length-1]+a[a.length-2]);
}
}
