import java.util.Scanner;

public class Giles_exercise733 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        String[] symbols = new String[12];

        System.out.print("Enter a year:");
        int year = input.nextInt();

        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
                "horse", "sheep"};

        System.out.println(zodiac[year % 12]);
        }
    }
