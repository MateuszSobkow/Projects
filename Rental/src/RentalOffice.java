import java.sql.Time;

public class RentalOffice extends Users {



    public static void main(String[] args) {

        Items book1 = new Items("Harry Potter", "J.K.Rowling", 300, 75 , 2);
        Items audiobook1 = new Items("Harry Potter","J.K.Rowling", ".mobi", 50, 3);
        Items move1 = new Items("Harry Potter","J.K.Rowling", Time.valueOf("1:50:0"), 40, 1);
        Items move2 = new Items("Harry Potter","J.K.Rowling", Time.valueOf("1:50:0"), 30, 1);

//        System.out.println(book1.getId());
//        System.out.println(audiobook1.getId());
//        System.out.println(move1.getId());
//        System.out.println(move2.getId());
//        System.out.println(book1.getPrice());
//        System.out.println(audiobook1.getPrice());
//        System.out.println(move1.getPrice());
//        System.out.println(move2.getPrice());

        Users first = new Users("Bartosz", "Jasnynos", "Whatever 12/4", 34);
//        first.getAll();
        System.out.println(book1.getItemsAmount());
        System.out.println(first.rentItem(book1));
        first.getLoan();
        System.out.println(book1.getItemsAmount());
        System.out.println(first.rentItem(book1));
        first.getLoan();
        System.out.println(book1.getItemsAmount());
        System.out.println(first.rentItem(book1));
        first.getLoan();

    }

}
