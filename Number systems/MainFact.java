class MainFact
{
      static int fact(int n)
      {
            int f=1;
         while(n>1)
          {
              f=f*n;
            n--;
       }
        return f;
}
public static void main(String args[])
{
int f1=fact(5);
int x=8;
System.out.println("factorial of 5 is "+f1);
System.out.println("factorial of 8 is "+fact(x));
}
}