//count divisor
import java.util.Scanner;
class CountDivisor
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any no:");
int n=sc.nextInt();
int count=1;
for(int i=1;i<=n/2;i++){//n/2 becaz it reduce code complexity(a no divides itself thats why we take it count=1)
if(n%i==0)
count++;
}
System.out.println("Divisor of "+n+" is "+count);
}
}