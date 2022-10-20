public class Zadanie1 {
    public static void main(String[] args) {
        double x = 170;
        if (x > 170) {System.out.println("Silnia za wielka");}
        if (x <= 0) { System.out.println("Liczba nie jest naturalna"); System.exit(1); }
        if ((x != (int)x)) { System.out.println("Liczba nie jest naturalna"); System.exit(1); }
        double silnia = 1;
        for (int i = 1; i <= x; i++) {
            silnia = silnia * i;
        }
        System.out.println("Silnia = "+ silnia);
    }
}