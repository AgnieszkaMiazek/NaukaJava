import java.util.Scanner;

//napisz program który poprosi użytkownika o 2 liczby a następnie wykonanie działań na
public class PracaDomowa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = firstNumber/secondNumber ;

        int mod = secondNumber%firstNumber;
        System.out.println("Wynik dodania" + addition);
        System.out.println("Odejmowanie:" + subtraction);
        System.out.println("Mnożenie:"+ multiplication);
        System.out.println("Dzielenie" + division);
        System.out.println("Modulo:" + mod);
    }
}

