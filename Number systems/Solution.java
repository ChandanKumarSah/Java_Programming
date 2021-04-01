//AMCAT QUESTION
import java.util.Scanner;
public class Solution
{
public static int discountAMT(int ordervalue)
{
int answer=0;
do
{
int r=ordervalue%10;
if(r==2 || r==3 || r==5 || r==7 )
answer=answer+r;
ordervalue=ordervalue/10;
}while(ordervalue!=0);
return answer;
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter any ordervalues");
int ordervalue=in.nextInt();
int result=discountAMT(ordervalue);
System.out.println(result);
}
}