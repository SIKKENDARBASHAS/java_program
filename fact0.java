import java.util.*;
class fact0
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int fact=1;
int count=0,sol=0;
for(int i=1;i<=n;i++)
{
	fact=fact*i;
}	
while(n>0)
System.out.print(count);
}
}