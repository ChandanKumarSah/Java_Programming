/*   10101
       1010
       101
       10
       1
                       */

import java.util.Scanner;	
class Pattern23
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of line");
    int n=sc.nextInt();	
    for(int i=n;i>=1;i--)
    {
    for(int j=1;j<=i;j++)
    {
   // if(j==2 || j==4)
     if(j%2==0)		
    System.out.print("0 ");
      else
         System.out.print("1 ");
        }
       System.out.println();
         }
             }
                      }