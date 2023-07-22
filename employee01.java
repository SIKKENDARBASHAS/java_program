import java.util.*;
class employee
{
void display1()
{
	Scanner sl=new Scanner (System.in);
	for(int i=0;i<5;i++)
	{
	System.out.print(" employee1 name:");
	String name=sl.next();
	System.out.print("	   age:");
	int age=sl.nextInt();
	System.out.print("	   phone:");
	long phone=sl.nextLong();
	System.out.print("	   id:");
	int employe_id=sl.nextInt();
   }
}
}
class employee01
{
	public static void main(String[] args)
	{
		employee myobj=new employee();
		myobj.display1();
	}
}