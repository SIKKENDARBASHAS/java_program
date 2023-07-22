import java.util.*;
class main3
{
public static void main(String []args)
{
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int i = scanner.nextInt();
int j = scanner.nextInt();
int p = scanner.nextInt();
int[][] board = new int[n][n];
for (int k = 0; k < n; k++) 
{
   for (int l = 0; l < n; l++) 
   {
      int dist = Math.max(Math.abs(k - i), Math.abs(l - j));
      board[k][l] = Math.max(0, p - dist);
   }
}
for (int k = 0; k < n; k++) 
{
for (int l = 0; l < n; l++) 
{
System.out.print(board[k][l] + " ");
}
System.out.println();
}
}
}