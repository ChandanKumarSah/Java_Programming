import java.util.Scanner;
class LeapYearOrNot2
{
public static void main(String args[])
{
Scanner sc=new  Scanner(System.in);
System.out.println("Enter  any year:");
int year=sc.nextInt();
String st=((year%4==0 && year%100!=0)|| year%400==0)?"Leap year.":"not a Leap year.";
System.out.println(year+"  is a  "+st);
}
}
