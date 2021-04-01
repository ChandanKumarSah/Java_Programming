/*1
    10
    101
    1010
    10101  */
import java.util.Scanner;
class Pattern18
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of line");
    int n=sc.nextInt();	
    for(int i=1;i<=n;i++)
    {
    for(int j=1;j<=i;j++)
    {
       /*if(j==2 || j==4)
    System.out.print(0);
    else
      System.out.print(1);*/
      System.out.print(j%2+" ");
        }
       System.out.println();
         }
             }
                      }