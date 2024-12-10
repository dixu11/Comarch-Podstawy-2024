import java.util.Scanner;

public class EqualsWyjasnienie {

    public static void main(String[] args) {
        double ileWypic = 1.5;
        char symbol = 'a';
        String text = "tak";
        String text2 = "tak";
        while(ileWypic>0){
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
}
