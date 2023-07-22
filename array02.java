import java.util.*;
class array02
{
public static void main(String args[])
{
Scanner sl=new Scanner(System.in);
int b[]={1,2,3,4,5};
int a[]={6,7,8,9,10};
int j=a.length;
for(int i=0;i<b.length;i++)
{
for(j=j-1;j<a.length;j--)
{
int sum=a[i]+b[j];
System.out.print( sum +" ");
break;
}
}
}
}
