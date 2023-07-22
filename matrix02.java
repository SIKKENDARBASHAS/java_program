import java.util.*;
class matrix02
{
public static void main(String args[])
{
int a[][]={{2,2},{6,8}};
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
if(i==0 && j==0)
{
System.out.print(a[1][1]+" ");
}
else if(i==1 && j==1)
{
System.out.print(a[0][0]+" ");
}
else if(i==1 && j==0)
{
System.out.print(-(a[1][0])+" ");
}
else if(i==0 && j==1)
{
System.out.print(-(a[0][1])+" ");
}
}
System.out.println();
}
{
for(int k=0;k<a.length;k++)
{
for(int l=0;l<a[k].length;l++)
{
if(k==0 && l==0)
{
System.out.print(a[1][1]/4 );
System.out.print(" ");
}
else if(k==1 && l==1)
{
System.out.print(a[0][0]/4);
System.out.print(" ");
}
else if(k==1 && l==0)
{
System.out.print((float)(a[1][0])/4);
System.out.print(" ");
}
else if(k==0 && l==1)
{
System.out.print((float)(a[0][1])/4);
System.out.print(" ");
}
}
System.out.println();
}
}
}
}

