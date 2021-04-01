import java.util.Scanner;
class SmallestAmongThreeNo2
{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter three No:");
double  a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double small=(a<b)?a:b;
  small=(small<c)?small:c;
 System.out.print(small+" is smallest no.");
}
}

