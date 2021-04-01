import java.util.Scanner;
class HowmanyDaysInTheMonth
{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number:");
int m=sc.nextInt();
if(m==1 || m==3|| m==5|| m==7|| m==8||m==10|| m==12)
System.out.print("31 days.");
else if(m==4 || m==6 || m==9 || m==11)
System.out.print("30 days.");
else if(m==2)
System.out.print("28 or 29 days.");
else
System.out.print("You entered a invalid month number.");
}
}