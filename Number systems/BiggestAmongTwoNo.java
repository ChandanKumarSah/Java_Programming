import java.util.Scanner;
class BiggestAmongTwoNo
{
public static void main(String[] ar)
{
Scanner sc=new  Scanner(System.in);
System.out.print("Enter 1st no=");
int a=sc.nextInt();
System.out.print("Enter 2nd no=");
int b=sc.nextInt();
if(a>b)
System.out.print(a+" is a biggest no.");
else
System.out.print(b+" is a biggest no.");
}
}