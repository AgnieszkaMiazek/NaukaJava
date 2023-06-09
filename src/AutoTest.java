public class AutoTest {
    public static void main(String[] args) {
        Auto peugeot = new Auto();
        peugeot.marka = "Peugeot";
        peugeot.model = "207";
        peugeot.rokProdukcji = 2007;
        peugeot.przebieg = 249000;

        peugeot.jedz();
        peugeot.hamuj();
        peugeot.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A3";
        audi.rokProdukcji = 2003;
        audi.przebieg = 219000;
        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto skoda  = new Auto();
        skoda.jedz();
        skoda.hamuj();
        skoda.info();





    }
}
