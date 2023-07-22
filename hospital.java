import java.util.*;
class hospital
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int tot=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]>=17 && a[i]<40)
{
tot+=400;
}
else if(a[i]<=17)
{
	tot+=200;
}
else if(a[i]>=40)
{
	tot+=300;
}
}
System.out.print(tot);
}
}
