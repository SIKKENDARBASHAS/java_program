import java.util.*;
class flames
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("MALE NAME:");
		String male=sc.nextLine();
		System.out.print("FEMALE NAME:");
		String female=sc.nextLine();
		String flames[]={"F","L","A","M","E","S"};
		int a=female.length();
		int count=0;
		for(int i=0;i<male.length;i++)
		{
			for(int j=0;j<a;j++)
			{
				if(male.charAt(i)==female.charAt(j))
				{
					count =count+1;
				}
			}
		}
		int count2=count+count;
		System.out.print(count2);
		System.out.print(total-count2);
	}
}