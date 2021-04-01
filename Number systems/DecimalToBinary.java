import java.util.Scanner;
class DecimalToBinary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any no:");
int n=sc.nextInt();
String rs=decToBin(n);
System.out.println("Binary no of "+n+" is "+rs);
}
static String decToBin(int dec)
{
String bin="";
do{
int r=dec%2;
bin=r+bin;
dec=dec/2;
}while(dec!=0);
return bin;
}
}