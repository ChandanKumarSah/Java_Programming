import java.util.Scanner;
class ArithmaticOperation{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st No:");
int a=sc.nextInt();
System.out.println("Enter 2nd No:");
int b=sc.nextInt();
int add=a+b;
int sub=a-b;
int mul=a*b;
int div=a/b;
System.out.println("Addition of Two no="+add);
System.out.println("substraction of Two no="+div);
System.out.println(" Multiplication of Two no="+mul);
System.out.println("Division of Two no="+div);
}
}