/*     
        1
      101
    10101
  1010101
101010101
                           */
import java.util.Scanner;	
class Pattern31
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of line");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
    for(int j=1;j<=n-i;j++)
    {	
        System.out.print("  ");
          }
    for(int j=1;j<=2*i-1;j++)
       {
      if(j%2==0)
         System.out.print("0 ");
       else
            System.out.print("1 ");
            }
       System.out.println(); 
      }
    }
 }