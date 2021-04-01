import java.util.Scanner;
class Details
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name:");
String name=sc.next();
System.out.println("Enter your Mobno:");
long Mobno=sc.nextLong();
System.out.println("Enter your emailid:");
String email=sc.next();
System.out.println("Your name is :"+name);
System.out.println("Your Mobno is :"+Mobno);
System.out.println("Your emailid is:"+email);
}
}
