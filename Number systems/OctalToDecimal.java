import java.util.Scanner;
class OctalToDecimal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a octal no:");
int n=sc.nextInt();
int rs=octToDec(n);
System.out.println("oct to dec convertion of  "+n+" is "+rs);
}
static int octToDec(int oct)
{
int dec=0,p=1;
do
{
int r=oct%10;
dec=dec+r*p;
p=p*8;
oct=oct/10;
}
while(oct!=0);
return dec;
}

}