/*
1
23
456
7891
23456
  */
import java.util.Scanner;
class Pattern21
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of line");
    int n=sc.nextInt();	
  int k=0;
    for(int i=1;i<=n;i++)
    {
    for(int j=i;j<=2*i-1;j++)
    {
    System.out.print(k%9+1+" ");
k++;
        }
       System.out.println();
         }
             }
                      }