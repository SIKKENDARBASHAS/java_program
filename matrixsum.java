import java.util.*;  
class matrix
{   
void display()   
{   
int  i, j;   
Scanner sc=new Scanner(System.in);   
int m = sc.nextInt();   
int n = sc.nextInt();   
int a[][] = new int[m][n];   
System.out.println("Enter the elements: ");   
for (i = 0; i < m; i++)   
for (j = 0; j < n; j++)   
a[i][j] = sc.nextInt();   
System.out.println("Elements of the array are: ");   
for (i = 0; i < m; i++)   
{   
for (j = 0; j < n; j++)   
{

 if(i==0 && j==0){
   System.out.print(a[0][0]+a[0][2]);}
   else if(i==1 && j==0){
   System.out.print(a[1][0]+a[1][2]);}
    else if(i==2 && j==0){
   System.out.print(a[2][0]+a[2][2]);}
else if(i==0 && j==2){
   System.out.print(a[0][2]-a[0][0]);}
   else if(i==1 && j==2){
   System.out.print(a[1][2]-a[1][0]);}
    else if(i==2 && j==2){
   System.out.print(a[2][2]-a[2][0]);}
else{
System.out.print(" "+a[i][j]+" ");}
}
System.out.println();   
}   
}   
}
class matrixsum
{
public static void main(String args[])
{
 matrix obj=new matrix();
 obj.display();
}
}