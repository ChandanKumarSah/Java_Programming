import java.util.Scanner;
class SmallestAmongTwoNo
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1st no:");
double a=sc.nextDouble();
System.out.print("Enter 2nd  no:");
double b=sc.nextDouble();
if(a>b)
System.out.print(b+" is smallest no:");
else
System.out.print(a+" is smallest no:");
}
}