import java.util.Scanner;

public class StringPorownanie {
    public static void main(String[] args) {
        //int double boolean, byte,short,long,float, char
        char symbol = '2';
        String text = "abcd";
        String text2 = "abcd";

        int liczba = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tak czy nie?");
        String odpowiedz = scanner.nextLine();
        if (odpowiedz.equals("tak") ) {
            System.out.println("Zgodziłeś się");
        } else if (odpowiedz.equals("nie")) {
            System.out.println("Nie zgadzasz się");
        } else {
            System.out.println("Nie rozumiem");
        }
    }
}
