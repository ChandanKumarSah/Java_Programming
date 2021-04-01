import java.util.Scanner;
class SubjectWisePassAndFail
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
if(p>=35 && c>=35 && m>=35 && b>=35)
System.out.print("Pass");
else
System.out.print("Fail");
}
}
/* if(p<35 || c<35 || m<35 || b<35)
sop("fail")
else
sop("fail") */