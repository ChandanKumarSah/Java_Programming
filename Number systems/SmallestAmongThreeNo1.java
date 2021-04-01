import java.util.Scanner;
class SmallestAmongThreeNo1
{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter three No:");
double  a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double small=a;
if(small>b)
small=b;
if(small>c)
small=c;
System.out.print(small+" is smallest no:");
}
}