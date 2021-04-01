import java.util.Scanner;
class CheckEvenAndOdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any integer value: ");
int n;
n=sc.nextInt();
if(n/2*2==n)//Without Using modulus operator.
System.out.println(n+" is an Even no.");
else
System.out.println(n+" is an Odd no.");
}
}