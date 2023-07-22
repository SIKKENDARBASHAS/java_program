import java.util.*;
class student
{
int id;
String name;
student(int i,String n)
{
	id=i;
	name=n;
}
void display()
{
	System.out.println(id+""+name);
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i1=sc.nextInt();
	String n1=sc.next();
	int i2=sc.nextInt();
	String n2=sc.next();
	student s1=new student(i1,n1);
	student s2=new student(i2,n2);
	s1.display();
	s2.display();
}
}