import java.util.Scanner;
class PositiveAndNegativeNo
{
public static void main(String[] ar)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any integer no:");
int n=sc.nextInt();
if(n>0)
System.out.print(n+" is a positive no.");
else
System.out.print(n+" is a negative no.");
}
}