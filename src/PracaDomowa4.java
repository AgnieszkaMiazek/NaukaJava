public class PracaDomowa4 {
    public static void main(String[] args) {
        Student ola = new Student();
        ola.imię = "Ola";
        ola.nazwisko = "Nowak";
        ola.numerIndeksu = 123456;
        ola.email = "olanowak123456@wp.pl";
        ola.nick = "OlaN";

        Student agnieszka = new Student();
        agnieszka.imię = "Agnieszka";
        agnieszka.nazwisko = "Miazek";
        agnieszka.numerIndeksu = 654321;
        agnieszka.email = "agnieszka654321@wp.pl";
        agnieszka.nick = "AgaM";

        Student borys = new Student();
        borys.imię = "Borys";
        borys.nazwisko = "Bartoszuk";
        borys.numerIndeksu = 654321;
        borys.email = "borysbart654321@wp.pl";
        borys.nick = "BartB";

        Student[] students = new Student[3];
        students[0] = ola;
        students[1] = agnieszka;
        students[2] = borys;

        for (int i = 0; 1 < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSię();

        }
    }
}
