import java.util.Scanner;
class FindAreaAndCircumOfCircle{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius of Circle:");
int  r=sc.nextInt();
double area=3.141*r*r;
double circum=2*3.141*r;
System.out.println("Area of Circle is:"+area);
System.out.println("Circum of Circle is:"+circum);
}
}

