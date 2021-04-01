 /*        
          a
      a  b  a
   a b  c  b  a
a b c d  c  b  a
   a b c  b  a
      a  b  a
          a
                         */
import java.util.Scanner;	
class Pattern46
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
           int k=97;
    for(int j=1;j<=st;j++)
       {
               System.out.print((char)k+"  ");
              
                if(j<=st/2)
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