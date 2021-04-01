import java.util.Scanner;
class Person{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Height:");
double ht=sc.nextDouble();
System.out.println("Enter Weight:");
double wt=sc.nextDouble();
double res=wt/(ht*ht);
System.out.println("BMI="+res);
}
}
