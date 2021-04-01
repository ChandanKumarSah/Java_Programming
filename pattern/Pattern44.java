      /*  
       
            1
       1  2  1
   1  2  3  2  1
1  2  34  3 2 1
   1  2  3  4  5
        1  2  3
             1
                     */

import java.util.Scanner;	
class Pattern44
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of line");
    int n=sc.nextInt();
       int sp=n/2;
      int st=1;
    for(int i=1;i<=n;i++)
    {
    for(int j=1;j<=sp;j++)
    {	
        System.out.print("   ");
               }
       int k=1;
    for(int j=1;j<=st;j++)
       {
               System.out.print(k+"  ");
              
                if(j<i)
              k++;
              else 
              k--;
               }
            if(i<=n/2)
                 {   sp--;
            st=st+2;
                          }
             else 
              {
             sp++;
            st=st-2;
                      }
            
       System.out.println();  
      }
   }
 }