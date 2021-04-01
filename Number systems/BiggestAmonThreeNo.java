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
if(a>b &&  b>c)
System.out.println(a+" is a biggest no.");
else if(b>c && b>a)
System.out.println(b+" is a biggest no.");
else
System.out.println(c+" is a biggest no.");
}
}