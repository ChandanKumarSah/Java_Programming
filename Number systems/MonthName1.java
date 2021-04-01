import java.util.Scanner;
class MonthName1
{
public static void main(String args[])
{
Scanner sc=new  Scanner(System.in);
System.out.println("Enter  any   integer:");
int n=sc.nextInt();
String ar[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
if(n>=1 && n<=12)
System.out.println("The name of month is", (ar[n-1]));
else
System.out.println("invalid month number.");
}
}
