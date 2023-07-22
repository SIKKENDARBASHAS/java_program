import java.util.*;
interface print
{
void sk();
}
class inter implements print
{
	public void print()
	{
		System.out.print("hlo");
	}
public static void main(String args[])
{
inter obj=new inter();
obj.sk();
}
}
