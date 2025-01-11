import java.lang.System;
import java.util.Scanner;
 class ifCondition
 {
    public static void main(String[] args)

    {
     
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the first number:");
      int num1 = obj.nextInt ();
      System.out.println("Enter the second number:");
    int num2 = obj.nextInt();

if(num1>num2)
{
    System.out.println("num1 is greater:"+num1);
}
else if(num1<num2)
{
    System.out.println("num2 is greater:"+num2);
}
else{
    System.out.println("Both numbers are equal:"+num1);
 }
  obj.close(); 
    }
 }