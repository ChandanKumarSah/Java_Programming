//Print divisor of   number from user
import java.util.Scanner;
class DivisorOfNo1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
int n=sc.nextInt();
int i=1;
while(i<=n)
{
if(n%i==0)
System.out.println("Divisor of  "+n+"  is:"+i);
i++;
}
}
}
