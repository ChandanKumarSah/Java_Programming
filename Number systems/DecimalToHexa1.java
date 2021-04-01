import java.util.Scanner;
class DecimalToHexa1
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
else if(r==10)
hex='A'+hex;
else if(r==11)
hex='B'+hex;
else if(r==12)
hex='C'+hex;
else if(r==13)
hex='D'+hex;
else if(r==14)
hex='E'+hex;
else
hex='F'+hex;
dec=dec/16;
}while(dec>0);
return hex;
}
}