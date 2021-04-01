import java.util.Scanner;
class MainSpecialTwoDigitNo
{
public static void main(String args[])
{
   System.out.println("enter any integer value:");
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
    boolean rs=isSpecialTwoDigit(x);
   if(rs==true)
    System.out.println(x+" is Special two digit no.");
         else
                        System.out.println(x+" is not Special two digit no.");
     }
      static boolean isSpecialTwoDigit(int n)
      {
     int d1=n%10;
     int d2=n/10;
     int sum=d1*d2+d1+d2;
    return sum==n;
}
     }
