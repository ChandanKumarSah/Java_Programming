import java.util.Scanner;
class LeapYearOrNot
{
public static void main(String args[])
{
Scanner sc=new  Scanner(System.in);
System.out.println("Enter  any four  integer values:");
int year=sc.nextInt();
if((year%4==0 && year%100!=0) || year%400==0)
System.out.println(year+" is a Leap year.");
else
System.out.println(year+" is not a Leap year.");
}
}
