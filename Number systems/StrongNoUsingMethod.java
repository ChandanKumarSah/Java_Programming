import java.util.Scanner;
class StrongNoUsingMethod
{

static boolean isStrong(int x)
        {
      int sum=0,temp=x;
          do{
               int r=x%10;
               sum=sum+fact(r);
             x=x/10;
       }
      while(x!=0);
      return sum== temp; 
    }

static  int fact(int s)
{
       int f=1;
   while(s>1)
{
     f=f*s;
    s--;
}
return f;
}

            public static void main(String args[]){
                        Scanner sc=new Scanner(System.in);
                      System.out.println("Entere any integer values:");
            int n=sc.nextInt();
            boolean rs=isStrong(n);//method calling 
          if(rs==true)
         System.out.println(n+" is a Strong  no.");
       else
         System.out.println(n+" is not a Strong no.");
                                 }
}
