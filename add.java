class add1
{
int a;
int b;
void ant(int a,int b)
{
this.a=a;
this.b=b;
}
}
class  cat extends add1
{
void sum()
{
int c=a+b;
System.out.print("sum" +c);
}
}
class add 
{
public static void main(String args[])
{
cat c=new cat();
c.ant(1,2);
c.sum();
}
}