import java.util.Scanner;
public class blanks
 {
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        String sentence = "i___________rathinam ";
        int index = sentence.indexOf("___________");
        System.out.println(sentence);
        System.out.println("1. Love");
        System.out.println("2. Hate");
        int option = scanner.nextInt();
        switch (option) 
		{
            case 1:
               String Sentence1 = sentence.substring(0, index) + " love " + sentence.substring(index + "___________".length());
               System.out.println(Sentence1);
               break;
			case 2:
               String Sentence2 = sentence.substring(0, index) + " hate " + sentence.substring(index + "___________".length());
               System.out.println(Sentence2);
               break;
			default:
               System.out.println("Invalid option.");
               return;
        }
    }
}