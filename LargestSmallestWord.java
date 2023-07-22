import java.util.*;
public class LargestSmallestWord
 {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String smallestWord = words[0];
        String largestWord = words[0];
        for (int i = 0; i < words.length; i++)
		{
            if (words[i].length() < smallestWord.length())
			{
                smallestWord = words[i];
            }
            if (words[i].length() > largestWord.length())
			{8
                largestWord = words[i];
            }
        }
        System.out.println("Smallest word: " + smallestWord);
        System.out.println("Largest word: " + largestWord);
    }
}