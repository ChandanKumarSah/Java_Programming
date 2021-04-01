import java.util.Scanner;
class PrimeNoUptoN
{
static boolean isPrime(int n){
  int temp=0;
        for(int i=2;i<=n/2;i++)
{
    if(n%i==0)  
   {
   temp=1;
break;
}  
}
   if(temp==0)
return true;
else 
return false;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0,count=0;
for(int i=2;i<=100;i++)
{
if(isPrime(i))
{
sum=sum+i;
System.out.println(i);
count++;
}
//System.out.println(count);
}
System.out.println("prime no are: "+count);
}
}