import java.util.Scanner;
class DigitOrNumber2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number:");
int n=sc.nextInt();
if(n<=9 && n>-9)
System.out.println("digit");
else
System.out.println("Number");
}
}