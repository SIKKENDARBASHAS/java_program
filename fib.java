import java.util.*;
class fib
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=0;i<a;i++)
{
for(int j=i+1;i<a;i++)
{
System.out.print(a[i]+a[j]);
}
}
}
}