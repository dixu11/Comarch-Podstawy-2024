import java.util.Arrays;
import java.util.Scanner;

public class Metody {
    public static void main(String[] args) {

       /* pijWodeJedenDzien();
        int[] a = new int[1];
        Arrays.toString(a);*/


        for (int i = 0; i < 7; i++) {
            pijWodeJedenDzien();
        }





    }

   static void pijWodeJedenDzien(){
        double ileWypic = 0.5;
        while (ileWypic > 0) {
            System.out.println("Do wypicia: " + ileWypic + " litra");
            System.out.println("Jeszcze nie wypiłeś wystarczająco. Czy pijesz wode?");
            Scanner scanner = new Scanner(System.in);
            String odpowiedz = scanner.nextLine();
            if (odpowiedz.equals("tak")) {
                ileWypic -= 0.3;
            }
        }
        System.out.println("Dobra robota!");
    }

    //sygnatura {
    //cialo
//   }
    // modyfikatory typ_zwracany nazwa (parametry)

}
