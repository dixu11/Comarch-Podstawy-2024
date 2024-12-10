import java.util.Random;

public class Tablice {
    public static void main(String[] args) {

        double cena1 = 1231;
        double cena2 = 23;
        double cena3 = 44;

        double suma = cena1 + cena2 + cena3;
        System.out.println(suma);

        double[] ceny = new double[1_000_000];
        ceny[0] = 1231;
        ceny[1] = 23;
        ceny[2] = 44;
        ceny[3] = 55;
        int licznik2 = 0;
        Random random = new Random();
        while (licznik2< ceny.length){
            ceny[licznik2] = random.nextInt(1,100);
            licznik2++;
        }


        System.out.println(ceny[0]);
        System.out.println(ceny[1]);
        System.out.println(ceny[2]);

        int licznik = 0;
        int suma2 = 0;
        while (licznik < ceny.length){
            System.out.println("Cena produktu:" + ceny[licznik]);
            suma2 += ceny[licznik];
            licznik++;
        }
        System.out.println("Wszystkie produkty sa warte: " + suma2);

    }
}
