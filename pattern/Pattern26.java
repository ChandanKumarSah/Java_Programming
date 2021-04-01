/*    
a
ab
abc
abcd
abcde
                    */
import java.util.Scanner;	
class Pattern26
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of line");
    int n=sc.nextInt();	
    for(int i=1;i<=n;i++)
    {
  int ch=97;
    for(int j=1;j<=i;j++)
    {	
          System.out.print((char)ch+" ");
          ch++;
        }
       System.out.println();
         }
    }
 }