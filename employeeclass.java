import java.util.Scanner;
class emp
{
    void display1()
	{
		System.out.print("employee name:");
		System.out.print("\t year of joining:");
		System.out.print("\t address:");
		for( int i=0;i<4;i++)
		{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter employee name ");
        String name = sc.nextLine();
        System.out.print("year of joining ");
        int joining = sc.nextInt();
        System.out.print("address"); 
        String address= sc.next();
		}
	}
}
class employee
{
	public static void main(String[] args)
	{
		emp myobj1=new emp();
		myobj1.display1();
	}
}
		
