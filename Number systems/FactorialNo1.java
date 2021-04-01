//Print factorial  number from user
import java.util.Scanner;
class FactorialNo1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
int n=sc.nextInt();
int i=1,f=1;
while(i<=n)
{
f=f*i;
i++;
}
System.out.println("Factorial no of  "+n+"  is:"+f);
}
}
