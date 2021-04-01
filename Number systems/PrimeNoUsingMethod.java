import java.util.Scanner;
class PrimeNoUsingMethod
{

static boolean isPrimeNo(int x)
        {
       for(int i=2;i<=x/2;i++)
              {
             if(x%i==0)
                return false;
      }
           return true;
    }
            public static void main(String args[]){
                        Scanner sc=new Scanner(System.in);
                      System.out.println("Entere any integer values:");
            int n=sc.nextInt();
            boolean rs=isPrimeNo(n);//method calling 
   if(rs==true)
         System.out.println(n+" is a prime no.");
       else
         System.out.println(n+" is not a prime no.");
                                 }
}