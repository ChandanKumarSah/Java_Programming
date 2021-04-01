class SumOfDigitAndProductOfDigit
{
static int prodOfDigit(int x) 
     {
    int prod=1;
do
{
  int r=x%10;
  x=x/10;
prod=prod*r;
    }
while(x!=0);
return prod;
       }
public static void main(String[] args)
            {
   int a=357;
      System.out.println("Sum of digit "+a+" is "+sumOfDigit(a));
      System.out.println("Product of digit "+a+" is "+prodOfDigit(a) );
         }
static int sumOfDigit(int x) 
     {
    int sum=0;
do
{
  int r=x%10;
  x=x/10;
sum=sum+r;
    }
while(x!=0);
return sum;
       }
   }