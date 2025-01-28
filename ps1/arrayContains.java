package ps1;

public class arrayContains {



    public static int getFirstValue(int []numbers)
    {
        return numbers[0];
    }
     public static void main(String[] args) {
        System.out.println(getFirstValue(new int []{1,2,3}));
        System.out.println(getFirstValue(new int []{80,5,100}));
        System.out.println(getFirstValue(new int []{-500,0,50}));
     }
}
