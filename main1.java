import java.util.Scanner;
public class main1 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) 
		{
            String s = scanner.next();
            int count = 0;
            for (int i = 0; i < s.length(); i++) 
			{
                if (s.charAt(i) == 'B') 
				{
                    int j = i - 1;
                    while (j >= 0 && s.charAt(j) == 'W') 
					{
                        count += 2;
                        j--;
                    }
                    j = i + 1;
                    while (j < s.length() && s.charAt(j) == 'W') 
					{
                        count += 2;
                        j++;
                    }
                }
            }
            
            System.out.println(count);
        }
        
        scanner.close();
    }
}




