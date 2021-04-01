import java.util.Scanner;
class CheckEvenAndOdd3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any integer value: ");
int n;
n=sc.nextInt();
String ar[]={"Even","Odd"};//without using conditional statement.
System.out.print(n+" is "+ar[n%2]);
}
}
