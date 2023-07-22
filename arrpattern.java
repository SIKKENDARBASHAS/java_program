import java.util.*;
class arrpattern
{
public static void main (String[] args)
{
    int x, y;
    int N = 3;
    int counter = 0;
    x = y = N + 2;
    int[][] array = new int[x][y];
    for( int i = 0; i<x; i++)
	{
        for( int j = 0; j < y; j++)
		{
            if( i == 0 || i == x-1 || j == 0 || j == y-1)
			{
                array[i][j] = 0;
            } 
			else if(i==2&&j==2)
			{
				 array[i][j] = 2;
			}
			else 
			{
                array[i][j] = 1;
            }
            System.out.print(array[i][j]);
        }
		System.out.println();
	}
}
}