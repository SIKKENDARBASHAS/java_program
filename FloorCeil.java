import java.util.*;
public class FloorCeil
 {    
    public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] a= {1,4,6,8,9};
        int floor = findFloor(a, num);
		int Ceil = findCeil(a, num);
        System.out.println("Floor of " + num + " is " + floor);
		System.out.println("ceil of " + num + " is " + Ceil);
    }
	public static int findFloor(int[] a, int num)
	{
        int start = 0, end = a.length-1, floor = -1;
        while (start <= end)
			{
            int mid = start + (end - start) / 2;
            if (a[mid] == num)
			{
                return a[mid];
            }
			else if (a[mid] < num)
			{
                floor = a[mid];
                start = mid+1;
            }
			else
			{
                end = mid-1;
            }
        }
        return floor;
    }
	public static int findCeil(int[] a, int num)
	{
        int start = 0, end = a.length-1, ceil = -1;
        while (start <= end)
			{
            int mid = start + (end - start) / 2;
            if (a[mid] == num) 
			{
                return a[mid];
            } 
			else if (a[mid] < num)
				{
                start = mid+1;
            } 
			else 
			{
                ceil = a[mid];
                end = mid-1;
            }
        }
        return ceil;
	}
}