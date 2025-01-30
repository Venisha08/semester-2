package ps1;
import java.util.Scanner;

public class FahrenhitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("Input a degree in Fahrenheit:");
double Fahrenheit = input.nextDouble();
double Celsius = ((5 *(Fahrenheit - 32.0))/9.0);
System.out.println(Fahrenheit+"degree fahrenheit is equal to "+ Celsius+ "in Celsius");
    }
}
