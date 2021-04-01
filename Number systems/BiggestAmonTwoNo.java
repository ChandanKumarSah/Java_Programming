import java.util.Scanner;
class BiggestAmonTwoNo
{
public static void main(String args[])
{
Scanner sc=new  Scanner(System.in);
System.out.println("Enter  any Two  integer values:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("1st no="+a);
System.out.println("2nd no="+b);
int big=(a>b)?a:b;
System.out.print(big+" is biggest no.");
}
}