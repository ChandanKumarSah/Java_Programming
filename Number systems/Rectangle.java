import java.util.Scanner;
class Rectangle{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length:");
int len=sc.nextInt();
System.out.println("Enter the breadth:");
int brea=sc.nextInt();
int area=len*brea;
int peri=2*(len+brea);
System.out.println("Area of reactangle:"+area);
System.out.println("Perimeter of reactangle:"+peri);
}
}