public class Zadanie3 {

    public static double Silnia(double x) {
        if (x > 170) {System.out.println("Silnia za wielka");}
        if (x <= 0) { System.out.println("Liczba nie jest naturalna"); System.exit(1); }
        if ((x != (int)x)) { System.out.println("Liczba nie jest naturalna"); System.exit(1); }
        double silnia = 1;
        for (int i = 1; i <= x; i++) {
            silnia = silnia * i;
        }
        return silnia;
    }
    public static double Potega(double x, double k) {
        if (x < 0 || k < 0) { System.out.println("Obydwie liczby muszą być naturalne"); System.exit(1); }
        if ((x != (int)x) || (k != (int)k)) { System.out.println("Obydwie liczby muszą być naturalne"); System.exit(1); }
        double potega = x;
        if (k == 0) {potega = 1;}
        else {
            for (int i = 1; i < k; i++) {
                potega = potega*x;
            }}
        return potega;
    }

    public static double E_x_jm(double x, int n) {
        double aprox_e = 1;
        double L; // Licznik
        double M = 1; // Mianownik
        for (int i = 1; i <= n; i++) {
            L = Potega(x,i);
            M = Silnia(i);;
            aprox_e = aprox_e + (L/M);
        }

        return aprox_e;
    }

    public static double Sin_x_jm(double x, int n) {
        double aprox_sin = x;
        double L; // Licznik
        double M = 1; // Mianownik
        for (int i = 1; i <= n; i++) {
            L = Potega(x,2*i+1);
            M = Silnia(2*i+1);;
            if (i%2 == 0) { aprox_sin = aprox_sin + (L/M);}
            else {aprox_sin = aprox_sin - (L/M);}
        }

        return aprox_sin;
    }
    public static double Cos_x_jm(double x, int n) {
        double aprox_cos = 1;
        double L; // Licznik
        double M = 1; // Mianownik
        for (int i = 1; i <= n; i++) {
            L = Potega(x,2*i);
            M = Silnia(2*i);
            if (i%2 == 0) { aprox_cos = aprox_cos + (L/M);}
            else {aprox_cos = aprox_cos - (L/M);}
        }

        return aprox_cos;
    }
    // wady stosowania własnych metod do silni i potęgi to:
    // ograniczenie dopuszczalnego zakresu liczb
    // niepotrzebnie dłuższy kod
    // wolniejsze wykonywanie programu i zużycie więcej zasobów
    // zaletą natomiast jest łatwiejsze debugowanie, podgląd obliczanych wartości "w toku"
    public static void main(String[] args) {
        int x = 80;
        int dokladnosc = 75;
        if ((x > 80) || (x < 0)) {
            System.out.println("Przewidziany zakres wartości x to od 1 do 80"); System.exit(1);
        }
        if ((dokladnosc > 80) || (dokladnosc < 1)) {
            System.out.println("Przewidziany zakres dokładnosci to 1 do 80, na prawdę nie potrzebujesz więcej"); System.exit(1);
        }
        System.out.println("Aproksymacja wartości Sin(x)= "+Sin_x_jm(x,dokladnosc));
        System.out.println("Aproksymacja wartości Cos(x)= "+Cos_x_jm(x,dokladnosc));
        System.out.println("Aproksymacja wartości e^x= "+E_x_jm(x,dokladnosc));
    }
}
