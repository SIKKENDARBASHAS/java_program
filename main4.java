import java.util.*;
class main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			String s=sc.next();
			char a[]=s.toCharArray();
			for(int i=0;i<a.length;i++)
			{
				if(a[i]=='W')
				{
					count++;
				}
			}
			System.out.println(count);
			count=0;
		}
}
}