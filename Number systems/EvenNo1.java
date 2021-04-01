import java.util.Scanner;
class EvenNo1
{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number:");
int n=sc.nextInt();
int i=1;
while(i<=n){
if(i/2*2==i)
System.out.println("even no is "+i);
i++;
}
}
}