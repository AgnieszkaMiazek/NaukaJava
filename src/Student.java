public class Student {
    public String imię ;
    public String nazwisko;
    public String nick;
    public String email;
public int numerIndeksu;
public void przedstawSie() {
    System.out.println("Nazywam się:" + imię + nazwisko);
} public  void zalogujSię() {
        System.out.println("Loguję się za pomocą: " + nick);
    }
        public void podajNrIndeksu() {
            System.out.println("Mój numer indeksu to: " + numerIndeksu);
        }
         public void podajEmail() {
            System.out.println("Mój email to: " + email);
        }
    }
