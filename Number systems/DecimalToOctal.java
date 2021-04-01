import java.util.Scanner;
class DecimalToOctal
{
public static void  main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any decimal no:");
int n=sc.nextInt();
String rs=decToOct(n);
System.out.println("Decimal to octal conversion of  "+n+" of  "+rs);
}
static String   decToOct(int dec)
{
  String oct="";
do{
int r=dec%8;
oct=r+oct;
dec=dec/8;
}while(dec>0);
return oct;
}
}