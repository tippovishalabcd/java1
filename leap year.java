import java.io.*;
public class e
{
  public static void main(String args[])
  {
    int year;
    Scanner scan=new Scanner(System.in);
    System.out.println(" enter the year:");
    year=scan.nextINT();
    if((year%4==0)&&(year%100!=0))
    {
    System.out.println(" it is a leap year");
    }
    else if((year%100==0)&&(year%400==0))
    {
    System.out.println(" it is a leap year");
    }
      else if(year%400==0))
      {
    System.out.println(" it is a leap year");
    }
    else 
    {
    System.out.println("it is not leap year");
    }
    }
    }
    
