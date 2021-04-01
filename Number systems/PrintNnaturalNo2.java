//Print n natural number from user using for loop
import java.util.Scanner;
class PrintNnaturalNo2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println(i);
}
}
}
