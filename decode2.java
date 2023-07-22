import java.util.*;
class decode2
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);  
	String num =sc.nextInt();
    int dec_value = 0;
    int base = 1;
    int len = num.length();
    for (int i = len - 1; i >= 0; i--)
		{
            if (num.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }
		System.out.print(dec_value);
    //Integer.parseint(num,2);
}
