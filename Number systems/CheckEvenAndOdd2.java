import java.util.Scanner;
class CheckEvenAndOdd2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any integer value: ");
int n;
n=sc.nextInt();
switch(n%2)//Without Using if/else.
{
case 0:
System.out.println(n+" is an Even no.");
break;
case 1:
System.out.println(n+" is an Odd no.");
break;
}
}
}