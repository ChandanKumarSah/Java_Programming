  /*     A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A   */

import java.util.Scanner;	
class Pattern38
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
       char k='A';
    for(int j=1;j<=2*i-1;j++)
       {
               System.out.print(k+" ");
            if(j<i)
               k++;
         else 
             k--;
            }
       System.out.println(); 
          
      }
   }
 }