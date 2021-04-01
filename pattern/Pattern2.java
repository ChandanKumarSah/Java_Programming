import java.util.Scanner;
class Pattern2
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Enter no of lines:");
for(int i=1;i<=n;i++)//no of lines
{
for(int j=1;j<=n;j++)//no of  coloumns
{
if(i==1 || i==n || j==1 || j==n || i==j || i+j==n+1)
System.out.print("*  ");
else
System.out.print("   ");
}
System.out.println();
}
}
}