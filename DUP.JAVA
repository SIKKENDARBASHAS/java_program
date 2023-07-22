import java.util.Scanner;
public class DUP
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i =0;i<words.length-1; i++) 
		{
			for(int j=i+1;i<words.length-i-1;i++)
			{
				if(words[j].length()>words[j+1].length())
				{
					String temp=words[j];
					words[j]=words[j+1];
					words[j+1]=temp;
				}
				else
				{
					continue;
				}
			}
		}
		for (int i =0;i<words.length; i++) 
		{
		System.out.println(words[i]+" ");
		}
    }
}