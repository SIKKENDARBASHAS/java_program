import java.util.*;
class happynum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n!=0)
{
int r=n;
int ans=0;
while(r!=0)
{
	int res=0;
	res=r%10;
	ans=ans+(res*res);
	r=r/10;
}
if(ans<10)
{
if(ans==1)
{
	System.out.println("happy number");
	break;
}
else
{
	System.out.println("sad number");
	break;
}
}	
else
{
	n=ans;
}
}
}
}

	