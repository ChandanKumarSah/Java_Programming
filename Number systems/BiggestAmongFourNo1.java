import java.util.Scanner;
class BiggestAmongFourNo1
{
public static void main(String args[])
{
Scanner sc=new  Scanner(System.in);
System.out.println("Enter  any four  integer values:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int big=a;
if(big<b)
big=b;
if(big<c)
big=c;
if(big<d)
big=d;
System.out.println("Biggest no is "+big);
}
}
