import java.util.*;
class finger
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=n%8;
		for(int i=0;i<res;i++)
		{
		if(res==1||res==9){
		System.out.print("THUMB");}
		else if(res==2||res==8){
		System.out.print("INDEX");}
		else if(res==3||res==7){
		System.out.print("MIDDLE");}
		else if(res==4||res==6){
		System.out.print("RING");}
		else if(res==5||res==13){
		System.out.print("LITTLE");
		break;}
		else {
			System.out.print("no finger");
		}
		}
	}
}