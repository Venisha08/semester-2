import java.util.Scanner; // getting input from user
public class BMI_Computed{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);//getting input
        System.out.print("Input weight in Kilogram:");//output
        double  weight = sc.nextDouble();
        System.out.print("Height in meters:");
        Double height = sc.nextDouble();
        double BMI = weight / (height*height);
        System.out.print("BMI is "+ BMI +"Kg/m2");
    }
}