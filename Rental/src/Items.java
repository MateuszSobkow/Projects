import java.sql.Time;
import java.time.LocalDate;
public class Items {
    private int id, price, pageNumber, itemsAmount;
    private static int idCounter = 1;
    private LocalDate borrowDate, returnDate;
    private String author, name, fileFormat;
    private Time duration;

    public Items(){}
//      Book
    public Items(String name,String author, int pageNumber, int price, int itemsAmount){
        this.id = setId();
        this.borrowDate = LocalDate.now();
        this.returnDate = borrowDate.plusDays(20);
        this.name = name;
        this.author = author;
        this.pageNumber = pageNumber;
        this.price = price;
        this.itemsAmount = itemsAmount;

    }
//    Audiobooks
    public Items(String name, String author, String fileFormat, int price, int itemsAmount){
        this.id = setId();
        this.borrowDate = LocalDate.now();
        this.returnDate = borrowDate.plusDays(20);
        this.name = name;
        this.author = author;
        this.fileFormat = fileFormat;
        this.price = price;
        this.itemsAmount = itemsAmount;
    }
//    Movies
    public Items(String name, String author, Time duration, int price, int itemsAmount){
        this.id = setId();
        this.borrowDate = LocalDate.now();
        this.returnDate = borrowDate.plusDays(20);
        this.name = name;
        this.author = author;
        this.duration = duration;
        this.price = price;
        this.itemsAmount = itemsAmount;

    }
    void getAll(){
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Author: " + this.author);
        System.out.println("Borrow Date: " + this.borrowDate);
        System.out.println("Deadline: " + this.returnDate);
        System.out.println("Price: " + this.price);

        if (fileFormat != null) {
            System.out.println("File format: " + this.fileFormat);
        } else if (duration != null) {
            System.out.println("Duration: " + this.duration);
        } else {
            System.out.println("Number of pages: " + this.pageNumber);
        }
        System.out.println("Available amount of that item is: " + itemsAmount);
    }
    int setId(){
        return id = idCounter++;
    }
    int getId(){
        return id;
    }
   LocalDate getBorrowDate(){
        return borrowDate;
   }
   LocalDate getReturnDate(){
        return returnDate;
   }
   int getPrice(){
        return price;
   }
   int getItemsAmount(){
        return itemsAmount;
   }
   void setItemsAmount(int borrowingAmount){
        this.itemsAmount -= borrowingAmount;
    }
    String getName(){
        return name;
    }

}
