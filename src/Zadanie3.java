public class Zadanie3 {
    public static double Sin_x_jm(double x, int n) {
        double aproksymacja = x;
        double L; // Licznik
        double M = 1; // Mianownik
        for (int i = 1; i <= n; i++) {
            L = Math.pow(x,2*i+1);
            M = M * (2*i) * (2*i+1);
            if (i%2 == 0) { aproksymacja = aproksymacja + (L/M);}
            else {aproksymacja = aproksymacja - (L/M);}
        }

        return aproksymacja;
    }
    public static double Cos_x_jm(double x, int n) {
        double aproksymacja = x;
        double L; // Licznik
        double M = 1; // Mianownik
        for (int i = 1; i <= n; i++) {
            L = Math.pow(x,2*i);
            M = M * (2*i) * (2*i+1); // TODO: change
            if (i%2 == 0) { aproksymacja = aproksymacja + (L/M);}
            else {aproksymacja = aproksymacja - (L/M);}
        }

        return aproksymacja;
    }
    public static void main(String[] args) {
        System.out.println("Aproksymacja wartości Sin: "+Sin_x_jm(5,9));
        System.out.println("Aproksymacja wartości Cos: "+Cos_x_jm(5,9));
    }
}
