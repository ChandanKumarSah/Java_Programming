import java.util.Scanner;
class CheckHarshadNo//in this program  we will take qoutent.
{
 public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any no:");
int n=sc.nextInt();
int rs= isHarshad(n);
System.out.println(rs);
}
static int  isHarshad(int x)
{

int sum=0;
int n=x;
do
{
int r=x%10;
sum=sum+r;
x=x/10;
}
while(x!=0);
if(x%sum==0)
return n/sum;
else  
return 0;
}
}