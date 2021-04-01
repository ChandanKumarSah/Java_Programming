import java.util.Scanner;
class Pattern3
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of lines:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)//no of lines
{
for(int j=1;j<=n;j++)//no of  coloumns
{
if(i==j || i+j==n+1 || j==n/2+1 || i==n/2+1)
System.out.print("*  ");
else
System.out.print("   ");
}
System.out.println();
}
}
}