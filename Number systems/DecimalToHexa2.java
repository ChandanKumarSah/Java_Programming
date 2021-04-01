import java.util.Scanner;
class DecimalToHexa2
{
public static void  main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any decimal no:");
int n=sc.nextInt();
String rs=decToHexa(n);
System.out.println("Decimal to Hexadecimal conversion of  "+n+" of  "+rs);
}
static String   decToHexa(int dec)
{
  String hex="";
do{
int r=dec%16;
if(r<10)
hex=r+hex;
else 
hex=(char)(r+55)+hex;
dec=dec/16;
}while(dec>0);
return hex;
}
}