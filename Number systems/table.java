import java.util.Scanner;
class table
{
  public static void main(String ar[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter any number:");
   int n=sc.nextInt();
   for(int i=1;i<=10;i++){
     System.out.println(n+"*"+i+"="+n*i);
   }
}
}
