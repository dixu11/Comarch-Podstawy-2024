public class Modulo {
    public static void main(String[] args) {
        System.out.println(20 % 2);
        int liczba = 12;
        if (liczba != 10) {
            System.out.println("nie jest 10");
        }

        //czy parzysta?
        if (liczba % 2 == 0) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }
    }
}
