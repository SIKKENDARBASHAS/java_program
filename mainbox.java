import java.util.*;
class box
{
	float height;
	float breath;
	float depth;
	box()
	{
		Scanner sc=new Scanner(System.in);
		height=sc.nextFloat();
		breath=sc.nextFloat();
		depth=sc.nextFloat();
		float value=height*breath*depth;
		System.out.print(value);
	}
}
class mainbox
{
public static void main(String[] args)
{
	box obj=new box();
}
}

	