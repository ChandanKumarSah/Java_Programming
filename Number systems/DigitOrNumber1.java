import java.util.Scanner;
class DigitOrNumber1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number:");
int n=sc.nextInt();
if(n>9 || n<-9)
System.out.println("Number");
else
System.out.println("Digit");
}
}