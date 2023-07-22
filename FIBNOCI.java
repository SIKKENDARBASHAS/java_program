import java.util.*;
class FIBNOCI
{
public static void main(String args[])
{
int f1,f2,f3;
f1=1;
f2=1;
f3=0;
Scanner sl=new Scanner(System.in);
int n=sl.nextInt();
int i=1;
while(i<=(n-2))
{
f3=f1+f2;
f1=f2;
f2=f3;
i++;
}
System.out.print(f3);
}
}