import java.util.Scanner;
class MonthName
{
public static void main(String args[])
{
Scanner sc=new  Scanner(System.in);
System.out.println("Enter  any   integer:");
int n=sc.nextInt();
String ar[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
/*if(n>=1 && n<=12)
System.out.println("The name of month number %d is %s\n", n, ar[n-1]);*/
for(int i=1;i<=12;i++){
if(i==n)
System.out.println(ar[n-1]);
}
System.out.println("invalid month number.");
}
}
