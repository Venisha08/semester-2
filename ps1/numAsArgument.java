package ps1;

public class numAsArgument {

    public static int addition(int number)
    {
        return number+1;
    }
    public static void main(String[] args) {
        System.out.println(addition(0));
        System.out.println(addition(10));

        System.out.println(addition(-3));
      }
    }
