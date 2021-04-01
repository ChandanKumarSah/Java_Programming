import java.util.Scanner;
class HappyNo
{
 public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any no:");
int n=sc.nextInt();
boolean rs=isHappy(n);
if(rs==true)
System.out.println(n+" is a HappyNo");
else
System.out.println(n+" is not a HappyNo");
}
static boolean isHappy(int x)
{
while(x>9)
{
int sum=0;
do
{
int r=x%10;
sum=sum+r*r;
x=x/10;
}
while(x!=0);
x=sum;
}
return x==1 || x==7;
}
}