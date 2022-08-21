import java.sql.Time;

public class RentalOffice extends Users {

    public static void main(String[] args) {

        Items book1 = new Items("Harry Potter", "J.K.Rowling", 300, 75 , 2);
        Items audiobook1 = new Items("Harry Potter","J.K.Rowling", ".mobi", 50, 3);
        Items move1 = new Items("Harry Potter","J.K.Rowling", Time.valueOf("1:50:0"), 40, 1);
        Items move2 = new Items("Harry Potter","J.K.Rowling", Time.valueOf("1:50:0"), 30, 1);

        Users first = new Users("Harry", "Potter", "Whatever 12/4", 34);



        first.rentItem(book1);
        first.rentItem(move1);
        first.rentItem(move2);
        first.rentItem(audiobook1);
        first.getLoan();
        first.returnItem(audiobook1);





    }

}
