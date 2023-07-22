import java.util.*;
class array03
{
public static void main(String args[])
{
int a[]={1,2,3,4,5};
int b[]={6,7,8,9,10};
int lena= a.length;
int lenb= b.length;
for(int i=0;i<lena/2;i++)
{
for(int j=lenb/2-1-i;j<lenb/2;j--)
{
System.out.println(a[i]+b[j]);
break;
}
}
for(int i=lena/2;i<=lena/2;i++)
{
for(int j=lenb/2;j<=lenb/2;j++)
{
System.out.println(a[i]+b[j]);
}
}
for(int i=3;i<lena;i++)
{
for(int j=lenb;j<lenb/2;j--)
{
System.out.println(a[i]+b[j]);
break;
}
}
for(int i=3;i<lena;i++)
{
for(int j=lenb-1;j<=3;j--)
{
System.out.println(a[i]+b[j]);
break;
}
}
}
}