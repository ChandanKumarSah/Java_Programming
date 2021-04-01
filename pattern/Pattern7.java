import java.util.Scanner;
class Pattern7
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of line");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
    for(int j=1;j<=n;j++)
    {
     if(j==1)
       System.out.print("a ");
     else  if(j==2)
        System.out.print("b ");
      else  if(j==3)
        System.out.print("c ");	
         else  if(j==4)
        System.out.print("d ");
          else 
        System.out.print("e ");
        }
         System.out.println();
         }
             }
                      }