import java.util.*;
class mallowtest1 
{
    public static List<List<Integer>> mallowtest1(int[] arr, int size)
	{
        List<List<Integer>>mallowtest1= new ArrayList<>();
        int index = 0;
        while (index < arr.length) 
		{
            List<Integer> chunk = new ArrayList<>();
            for (int i = index; i < Math.min(index + size, arr.length); i++) 
			{
                chunk.add(arr[i]);
            }
            mallowtest1.add(chunk);
            index += size;
        }
        return mallowtest1;
    }
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int[] arr = new int[n];
        int size = sc.nextInt();
        List<List<Integer>> result =mallowtest1(arr, size);
        System.out.println(result); 
    }
}
