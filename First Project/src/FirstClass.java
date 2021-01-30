import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        Scanner wtf = new Scanner(System.in);
        System.out.println("Enter degrees celsius");
        double celsius = wtf.nextDouble();
        System.out.println(celsius + " Celcius = " + (celsius * (9.0 / 5) + 32 ) + " Farehnhiet");

    }



}