import java.util.Scanner;

// Zapytaj użytkownika o wiek, w przypadku gdy ma mniej niż 18 lat, nie możemy sprzedać alkoholu. Jeśli ma 18 lub powyżej, dziękujemy za zakup
public class PracaDomowa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek:");
        int age = scanner.nextInt();
        if(age < 18 && age >0) {
            System.out.println("Nie możesz kupić alkoholu.");
        } else if (age < 0) {
            System.out.println("Wprowadź wartość poprawną.");
           ;
    } else {
            System.out.println("Dziękuję za zakupy, zapraszam ponownie.");
        }
    }}
