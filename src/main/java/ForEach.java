public class ForEach {
    public static void main(String[] args) {
        int[] liczby = {23, 45, 56, 23, 546, 456};

        for (int i = 0; i < liczby.length; i++) {
            int liczba = liczby[i];
            System.out.println(liczba);
        }

        for ( int liczba : liczby){
            System.out.println(liczba);
        }

        for (int liczba : liczby) { //iter

        }
    }
}
