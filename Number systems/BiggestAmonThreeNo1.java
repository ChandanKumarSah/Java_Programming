import java.util.Scanner;
class BiggestAmonThreeNo1
{
public static void main(String args[])
{
Scanner sc=new  Scanner(System.in);
System.out.println("Enter  any Three  integer values:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int big=a;
if(big<b)
big=b;
if(big<c)
big=c;
System.out.println("Biggest no is "+big);
}
}
