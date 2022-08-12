import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Sort extends Write implements Sortable {
     public int step;
    @Override
    public int[] sort(int[] tab) {
        step = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < tab.length; j++) {
                if (tab[j - 1] > tab[j]){
                    int a = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = a;
                    step++;
                }
            }
        }
        return tab;
    }
    @Override
    public double step_counting() {
        return 0;
    }
    public int[] sortMine(int[] tab){
        step = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[i]) {
                    int a = tab[j];
                    tab[j] = tab[i];
                    tab[i] = a;
                    step++;
                }
            }
        }
        return tab;
    }

    public static void main(String[] args) throws IOException {
        Random a = new Random();
        Sort sortuj = new Sort();
        Write zapis = new Write();
        Scanner scan = new Scanner(System.in);

        PrintWriter writer = new PrintWriter("Po_zmianie.txt");
        writer.print("");
        writer.close();


        System.out.println("Jakie sortowanie ?: \n 'b' \t czy \t 'm'? ");

        char sortingMethod = scan.next().charAt(0);

        for (int loop = 0; loop < 10000; loop++) {
            int[] tablica = new int[100];

            for (int i = 0; i < tablica.length; i++) {
                tablica[i] = a.nextInt(100_000);
            }
            for (int x : tablica) {
                System.out.println(x);
            }

            System.out.println("Po sortowaniu:");

            if (sortingMethod == 'b') {

                for (int x : sortuj.sort(tablica)) {
                    System.out.println(x);
                }

                System.out.println("Stortowanie wymagalo " + sortuj.step + " iteracji");
                zapis.writeAdd(sortuj.step);

            } else if (sortingMethod == 'm') {

                for (int x : sortuj.sortMine(tablica)) {
                    System.out.println(x);
                }

                System.out.println("Stortowanie wymagalo " + sortuj.step + " iteracji");
                zapis.writeAdd(sortuj.step);

            } else {
                System.out.println("Zle wpisano!");
            }
        }
        System.out.println("Srednia ilosc iteracji wyniosla " + zapis.getAverage());


    }
}

