class MainSpecialTwoDigitNo1
{
public static void main(String args[])
{
 for(int i=10;i<=99;i++){
    boolean rs=isSpecialTwoDigit(i);//calling method 
   if(rs==true)
System.out.println(i);
                    }
     }
      static boolean isSpecialTwoDigit(int n)//callled method 
      {
     int d1=n%10;
     int d2=n/10;
     int sum=d1*d2+d1+d2;
    return sum==n;
}
     }
