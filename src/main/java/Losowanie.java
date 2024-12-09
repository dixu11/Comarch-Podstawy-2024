import java.util.Random;

public class Losowanie {
    public static void main(String[] args) {
        //od 5-10
        int min = 5;
        int max = 10;
        Random random = new Random();
        int wylosowana =  random.nextInt(max-min + 1) + min; //min-max
        System.out.println(wylosowana);

        int wylosowana2 = random.nextInt(5,11); //5-10  - od java 17
        System.out.println(wylosowana2);

    }
}
