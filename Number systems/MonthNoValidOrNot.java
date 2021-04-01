import java.util.Scanner;
class MonthNoValidOrNot
{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a month number:");
int n=sc.nextInt();
if(n<=12)
System.out.print(n+" is a valid  month number:");
else
System.out.print(n+" is not a valid  month number:");
}
}