 import java.sql.SQLOutput;

public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        //inkrementacja zwiększenie wartści o jeden

        int a = 0;
        System.out.println("Wartość a:" + a ); // 0
        int b = a++; // postinkrementacja
        System.out.println("Wartość b:" + b); // najpierw zwrócenie wyniku - 0
        System.out.println("wartość a:" + a); // zwiękrzenie wartości o jeden = 1
        int c = ++a; // preinkrementacja
        System.out.println("wartość c:" + c ); //2
        System.out.println("wartość a:" + a ); // 2

        //dekrementacja - zmniejszenie wartości o jeden
        int d = 0;
        System.out.println("Wartość d:" + d); // 0
        int e = d--;
        System.out.println("wartość e:" + e); // 0
        System.out.println("wartość d:" + d); // -1
        int f = --d;
        System.out.println("wartość f:" + f); // -2
        System.out.println("wartość d:" + d); // -2
// zapis w pętli - post i pre
    }
}
