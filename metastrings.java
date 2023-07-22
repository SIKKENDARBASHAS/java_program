import java.util.*;
public class metastrings
{
    public static boolean strings(String str1, String str2)
	{
        if (str1.length() != str2.length()) 
		{
            return false;
        }
        int Count = 0;
        int[] a= new int[26];
        for (int i = 0; i < str1.length(); i++) 
		{
            if (str1.charAt(i) != str2.charAt(i)) 
			{
               Count++;
                a[str1.charAt(i) - 'a']++;
                a[str2.charAt(i) - 'a']--;
            }
        }
        if (Count != 2) 
		{
            return false;
        }
        for (int i = 0; i < 26; i++) 
		{
            if (a[i] != 0) 
			{
                return false;
            } 
        }
		 return true;
    }
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Two strings:");
        String str1 = sc.next();
        String str2 = sc.next();
        if (strings(str1, str2)) 
		{
            System.out.println("Yes, it's meta strings.");
        } 
		else 
		{
            System.out.println("No, strings are not meta strings.");
        }
    }
}