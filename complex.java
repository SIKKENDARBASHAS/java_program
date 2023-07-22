import java.util.*;
class com{
	public static void add(int ar[],int br[]) 
	{
		int sum=0;
		int com=0;
		for(int i=0;i<2;i++) 
		{
			sum=ar[0]+br[0];
		}
		for(int i=0;i<2;i++) 
		{
			com=ar[1]+br[1];
		}
		System.out.print(sum+"+"+com+"i");
		System.out.println();
	}
	public static void sub(int arr[],int brr[]) 
	{
		int sub=0;
		int com=0;
		for(int i=0;i<2;i++) 
		{
			sub=arr[0]-brr[0];
		}
		for(int i=0;i<2;i++) 
		{
			com=arr[1]-brr[1];
		}
		System.out.println(sub+"+"+com+"i");
	}
	public static void mul(int arr[],int brr[])
	{
		int mul=0;
		int com=0;
		for(int i=0;i<2;i++) 
		{
			mul=arr[0]*brr[1]+arr[1]*brr[0];
		}
		for(int i=0;i<2;i++) 
		{
			com=brr[0]*brr[0]+arr[1];
		}
		System.out.println(mul+"+"+com+"i");
}
}
public class complex {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		com comp=new com();
		int[] a=new int[5];
		int[] b=new int[5];
		for(int i=0;i<2;i++) 
		{
			a[i]=scan.nextInt();
		}
		for(int i=0;i<2;i++) 
		{
			b[i]=scan.nextInt();
		}
	comp.add(a,b);
	comp.sub(a,b);
	comp.mul(a,b);
	}
}