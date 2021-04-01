import java.util.Scanner;
class PositiveAndNegativeNo1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
           System.out.print("Enter a number:");
int n=sc.nextInt();
   String st=(n>0)?"positive no.":"negative no.";
System.out.print(n+" is a "+st);
}
}
