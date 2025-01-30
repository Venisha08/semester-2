package ps1;

public class minValOfDataType {
    public static void main(String []args)
    {
        short a =10;
        byte b=5;
        float c= 3.99f;
        double d= 10.99d;
        long e = 878768768L;
    

        System.out.println("value of a = "+a);
        System.out.println("short type MAXIMUM Value ="+Short.MAX_VALUE);
        System.out.println("short type Minimum value =" + Short.MIN_VALUE);

       ///System.out.println(" Value of b="+b);
        //System.out.println("byte type MAXIMUM VALUE ="+byte.MAX_VALUE);
        //System.out.println("byte type of MINIMUM VALUE ="+byte.MIN_VALUE);

        System.out.println("Value of a = " + c);
    System.out.println("float type MAXIMUM Value = " + Float.MAX_VALUE);
    System.out.println("float type MINIMUM Value = " + Float.MIN_VALUE);
    
    System.out.println("\nValue of b = " + d);
    System.out.println("double type MAXIMUM Value = " + Double.MAX_VALUE);
    System.out.println("double type MINIMUM Value = " + Double.MIN_VALUE);
    
    System.out.println("\nValue of c = " + e);
    System.out.println("long type MAXIMUM Value = " + Long.MAX_VALUE);
    System.out.println("long type MINIMUM Value = " + Long.MIN_VALUE);
    }
}
