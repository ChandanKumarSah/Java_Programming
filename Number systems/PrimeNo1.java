//count Primeno
import java.util.Scanner;
class PrimeNo1
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
if(count==2)
System.out.println(n+" is a Prieme no.");
else
System.out.println(n+" is not a Prieme no.");
}
}