import java.io.*;
import java.util.Scanner;

public class Write {
    private int averageNumber;
    private int totalStep;
    void writeAdd(int value) throws IOException {
        PrintWriter zapis = new PrintWriter(new FileWriter("Po_zmianie.txt", true));
        zapis.println(value);
        zapis.close();
    }
    int getAverage() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Po_zmianie.txt"));
        averageNumber = 0;
        totalStep = 0;
        while (scan.hasNext()){

            String a = scan.nextLine();
            int number = Integer.parseInt(a);
            averageNumber += number;
            totalStep++;
        }
        return averageNumber /= totalStep;

    }

}

