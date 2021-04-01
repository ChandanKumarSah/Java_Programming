import java.util.Scanner;
class  BiggestAmong3No
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println(" Enter any 3 integer values: ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b && a>c)
System.out.print(a+" is a Biggest no. ");
else if(b>c)
System.out.print(b+" is a Biggest no. ");
else
System.out.print(c+" is a Biggest no.");
}
}