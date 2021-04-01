import java.util.Scanner;
class HappyNoUsingMethod
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any  no:");
int n=sc.nextInt();
int rs=ishappy(n);
if(rs==1)
System.out.println(n+" is a Happy no.");
else 
System.out.println(n+" is not a Happy no.");
}
static int ishappy(int s)
{
  
int sum=0;
do{
int r=s%10;
sum=sum+pow(r,2);
s=s/10;
}while(s!=0);
return sum;
}
static int pow(int no,int p)
{
int pw=1;
while(p<=2)
{
pw=pw*no;
p--;
}
return pw;
}
}