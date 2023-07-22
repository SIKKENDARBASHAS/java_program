import java.util.*;
class handshake
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int tot=0;
	for(int i=n-1;i>=1;i--)
	{
		tot+=i;	
	}
	System.out.print(tot);
	}
}