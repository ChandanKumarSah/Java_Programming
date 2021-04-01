import java.util.Scanner;
class CheckEvenAndOdd4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any integer value: ");
int n;
n=sc.nextInt();
    String st=(n%2==0)?"Even":"Odd";
System.out.print(n+" is an "+st);
}
}
