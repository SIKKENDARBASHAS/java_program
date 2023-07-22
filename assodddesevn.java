import java.util.*;
class assodddesevn
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int[] odd = new int[n];
        int[] even = new int[n];
		int oddcount=0;
		int evencount=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				odd[i]=a[i];
			}
			else
			{
				even[i]=a[i];
			}
		}
		Arrays.sort(odd);
		Arrays.sort(even);
		System.out.print(odd+""+even);
	}
}