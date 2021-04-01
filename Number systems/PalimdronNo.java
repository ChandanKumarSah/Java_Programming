import java.util.Scanner;
class PalimdronNo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any no:");
int n=sc.nextInt();
boolean rs=isPalimdron(n);
if(rs==true)
System.out.println(n+" is a palimdron no.");
else
     System.out.println(n+" is not a palimdron no.");
}
static boolean isPalimdron(int x)
{
  return x==reverse(x);
}
static int reverse(int no)
{
int rev=0;
do 
{
int r=no%10;
rev=rev*10+r;
no=no/10;
}
while(no!=0);
return rev;
}
}