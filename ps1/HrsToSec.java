package ps1;

public class HrsToSec{
    public static int howManySec(int hours)
    {
        return hours *3600;
    }

    public static void main(String args[])
    {
    System.out.println(howManySec(2));
    System.out.println(howManySec(10));
    System.out.println(howManySec(24));
}
}
