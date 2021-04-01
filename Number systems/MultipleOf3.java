import java.util.Scanner;
class MultipleOf3
{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number:");
int n=sc.nextInt();
for(int i=3;i<=n;i=i+3)
{
System.out.println(i);
}

}
}