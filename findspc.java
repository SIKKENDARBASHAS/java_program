import java.util.*;
class findspc
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
char a[]=str.toCharArray();
int alphabet=0,numbers=0,symbol=0;
for(int i=0;i<str.length();i++)
{
	if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))
	{
		alphabet++;
	}
	else if((str.charAt(i)>='0' && str.charAt(i)<='9'))
	{
		numbers++;
	}
	else
	{
		symbol++;
	}
}
System.out.print(numbers + " " + alphabet + " " + symbol);
}
}