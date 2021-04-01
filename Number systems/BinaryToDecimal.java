import java.util.Scanner;
class BinaryToDecimal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a binary no:");
int n=sc.nextInt();
int rs=binToDec(n);
System.out.println("bin to dec convertion of  "+n+" is "+rs);
}
static int binToDec(int bin)
{
int dec=0,p=1;
do
{
int r=bin%10;
dec=dec+r*p;
p=p*2;
bin=bin/10;
}
while(bin!=0);
return dec;
}

}