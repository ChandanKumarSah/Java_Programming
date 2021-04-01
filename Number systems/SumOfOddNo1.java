import java.util.Scanner;
class MultipleOf3
{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number:");
int n=sc.nextInt();
int count=0;
for(int i=1;i<=n;i++)
{
if(n%3==0)
count++;
}
System.out.println(count);
}
}