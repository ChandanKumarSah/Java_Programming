import java.util.Scanner;
class ResultWisePassAndFail
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your physics marks:");
int p=sc.nextInt();
System.out.println("Enter your chemistry marks:");
int c=sc.nextInt();
System.out.println("Enter your mathematics  marks:");
int m=sc.nextInt();
System.out.println("Enter your biology  marks:");
int b=sc.nextInt();
if(p<35 || c<35 || m<35 || b<35)
System.out.print("Fail");
else{
double per=(p+c+m+b)/4.0;
if(per>=85)
System.out.print("Distinction.");
else if (per>=60)
System.out.print("First class.");
else if(per>=50)
System.out.print("Second class.");
else
System.out.print("Pass");
}
}
}
