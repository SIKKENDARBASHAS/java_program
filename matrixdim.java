import java.util.*;
class matrixdim
{
 public static void main(String[]args)
 {
   int a[][]={{29,33,54},{86,85,68},{82,41,57}};
   for(int i=0;i<=2;i++)
   {
     for(int j=0;i<=2;j++)
     {
       if(i==0&&j==0)
       {
         System.out.print(a[0][1]%10);
       }
       else if(i==0&&j==2)
       {
         System.out.print(a[1][2]%10);
       }
       else if(i==2&&j==0)
       {
         System.out.print(a[1][0]%10);
       }
       else if(i==2&&j==2)
       {
         System.out.print(a[2][1]%10);
       }
       else if(i==0&&j==1)
       {
         System.out.print(a[0][0]%10);
       }
       else if(i==1&&j==2)
	   {
		   System.out.print(a[0][2]%10);
	   }
	   else if(i==2&&j==1)
	   {
		   System.out.print(a[2][2]%10);
	   }
	   else if(i==1&&j==0)
	   {
		   System.out.print(a[2][0]%10);
       }
	   else
	   {
	   System.out.print(a[i][j]%10);
	   } 
	System.out.print(" ");	 
   }
   System.out.println();
   }
 }
}