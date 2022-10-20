public class Zadanie2 {
    public static void main(String[] args) {
        double x = 12;
        double k = 30;
        if (x < 0 || k < 0) { System.out.println("Obydwie liczby muszą być naturalne"); System.exit(1); }
        if ((x != (int)x) || (k != (int)k)) { System.out.println("Obydwie liczby muszą być naturalne"); System.exit(1); }
        double potega = x;
        if (k == 0) {potega = 1;}
        else {
            for (int i = 1; i < k; i++) {
            potega = potega*x;
        }}

        System.out.println("Wynik potęgowania = "+ potega);
    }
}