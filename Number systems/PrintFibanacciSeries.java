import java.util.Scanner;
class PrintFibanacciSeries
{
public static void main(String []args)
{
PrintFibanacciSeries obj=new PrintFibanacciSeries();
Scanner sc=new Scanner(System.in);
System.out.println("Enter any no:");
int n=sc.nextInt();
obj.printFibanacci(n);
}
void printFibanacci(int n)
{
int f1=0,f2=1;
while(n>0)
{
System.out.println(f1+" ");
int f3=f1+f2;
f1=f2;
f2=f3;
n--;
}
}
}