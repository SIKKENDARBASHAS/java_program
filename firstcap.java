/*import java.util.Scanner;
class firstcap
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        String n= sc.nextLine();
        String[] words = n.split(" ");
		for (int i =0;i<words.length; i++) 
		{
			for(int j=i+1;i<words.length;i++)
			{
			if(words[i]==' ')
				{
					i=i+1;*/

/*import java.util.Locale;
import java.util.Scanner;

public class firstcap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String res="";
        res=res+String.valueOf(a.charAt(0)).toUpperCase();
        for(int i=1;i<a.length();i++){
            if (a.charAt(i) == ' ') {
                res=res+" "+String.valueOf(a.charAt(i+1)).toUpperCase();
                i++;
            }else{
                res=res+a.charAt(i);
            }
        }

        System.out.println(res);
    }
}
					
*/
import java.util.Scanner;
public class firstcap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt();
     int s[]=new int[n];
     for(int i=0;i<n;i++)
     {
    	 s[i]=sc.nextInt();
     }
     int num=sc.nextInt();
     int count=0;
     for(int i=0;i<n;i++)
     {
    	 if(s[i]%num==0||num%s[i]==0)
    	 {
    		 count++;
    	 }
     }
     System.out.print(count);
	}
}
