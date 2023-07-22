import java.util.Scanner;
public class maximum
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++)
		{
            for(int j=0;j<3;j++)
			{
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0;
        int maxo=0;
        for(int i=0;i<3;i++)
		{
            int count=0;
            for(int j=0;j<3;j++)
			{
                if(arr[i][j]==1)
				{
                    count++;
                }
            }
            if(count>max)
			{
                max=count;
                maxo=maxo+1;
            }
        }
        System.out.print(maxo);
    }
}