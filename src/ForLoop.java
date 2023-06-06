public class ForLoop {
    public static void main(String[] args) {
       for (int i = 0; i < 100; i=i+2){// i - zmienna sterująca - od niej zaczynamy
           System.out.println(i);  // wypisuje co drugą liczbę
       }
       for (int i=0; i < 100 ; i++) {
           if (i % 5 == 0)
               System.out.println(i);
       } int number = 1000000;
       for (int j=0;j<number;j++)
           System.out.println("Będę robiła pracę domową :D");
    }
}
