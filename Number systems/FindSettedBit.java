import java.util.Scanner;
class FindSettedBit
{
static int countSettedBits(int n)
{
int count=0;
do
{
int r=n%2;
count=count+r;
n=n/2;
}while(n!=0);
return count;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any  no");
int n=sc.nextInt();
int rs=countSettedBits( n);
System.out.println(rs);
}
}