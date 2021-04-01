import java.util.Scanner;
class ArmstrongNoUsingMethod
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any  no:");
int n=sc.nextInt();
boolean rs=isArmstrong(n);
if(rs==true)
System.out.println(n+" is a Armstrong no.");
else 
System.out.println(n+" is not a Armstrong no.");
}
static boolean isArmstrong(int s)
{
  int dc=countDigit(s);
int sum=0,temp=s;
do{
int r=s%10;
sum=sum+pow(r,dc);
s=s/10;
}while(s!=0);
return sum==temp;
}
static int  countDigit(int s)
{
int count=0;
do
{
count++;
s=s/10;
}
while(s!=0);
return count;
}
static int pow(int no,int p)
{
int pw=1;
while(p>0)
{
pw=pw*no;
p--;
}
return pw;
}
}