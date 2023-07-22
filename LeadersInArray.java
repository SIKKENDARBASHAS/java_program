import java.util.Scanner;
public class LeadersInArray 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) 
		{
            arr[i] = input.nextInt();
        }
        int maxRight = arr[n-1];
        System.out.print("Leaders in the array: " + maxRight + " ");
        for (int i = n-2; i >= 0; i--) 
		{
            if (arr[i] >= maxRight) 
			{
                maxRight = arr[i];
                System.out.print(maxRight + " ");
            }
        }
    }
}
