import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean loop = false;
        System.out.println("Witaj w kalkulatorze!");

        while (!loop){
            double firstNumber = 0;
            double secondNumber = 0;
            Maths math = new Maths();

            System.out.println("Podaj pierwsza liczbe:");
            Scanner scan = new Scanner(System.in);

            if (scan.hasNextDouble()) {
                firstNumber = scan.nextDouble();
            } else if (scan.hasNext()) {
                System.out.println("To nie jest liczba");
                firstNumber = -2147483648;
                System.exit(0);
            }

            System.out.println("Podaj druga liczbe:");
            if (scan.hasNextDouble()) {
                secondNumber = scan.nextDouble();
            } else if (scan.hasNext()) {
                System.out.println("To nie jest liczba");
                secondNumber = -2147483648;
                System.exit(0);
            }
            System.out.println("Twoje liczby to:\n" + firstNumber + '\n' + secondNumber);
            System.out.println("Co chcesz z nimi zrobic?:\t Dodawanie + \t Odejmowanie - \t Mnozenie * \t Dzielenie / \t Zakonczenie #");
            switch (scan.next().charAt(0)) {
                case '+' -> math.add(firstNumber, secondNumber);
                case '-' -> math.substract(firstNumber, secondNumber);
                case '*' -> math.multiply(firstNumber, secondNumber);
                case '/' -> math.divide(firstNumber,secondNumber);
                case '#' -> loop = true;
                default -> {
                    System.out.println("Podano zly znak, popraw sie!");
                    return;
                }
            }
            System.out.println("Wynik to: " + math.getResult());
        }
    }
}
