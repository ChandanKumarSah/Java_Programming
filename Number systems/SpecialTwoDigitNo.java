import java.util.Scanner;
class SpecialTwoDigitNo
{
   public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Any two digit no:");
int x=sc.nextInt();
int d1=x/10;
int d2=x%10;
int sum=d1+d2+d1*d2;
if(sum==x)
System.out.println(x+" is a special two digit number.");
else
System.out.println(x+" is not a special two digit number.");
System.out.println("Th@nk you........");
}
}