import java.util.*;
class flip
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int flips=0;
		int xor=a^b;
		while(xor>0)
		{
			if((xor&1)==1)
			{
				flips++;
			}
			xor=xor>>1;
		}
		System.out.println("FLIPS" +flips);
	}
}
				