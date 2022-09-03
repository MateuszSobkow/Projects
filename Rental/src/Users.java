import com.sun.source.tree.IfTree;

import java.time.LocalDate;

public class Users extends Items{
    private String name, surname, address;
    private int age, numberOfBorrowedItems;

  Users(){
      System.out.println("Empty client");
  }
     Users(String name, String surname, String address, int age){
         super();

         this.name = name;
        this. surname = surname;
        this. age = age;
        this.address = address;
        this.numberOfBorrowedItems = 0;
    }
    public void getAll(){
        System.out.print(name + " " + surname);
        System.out.println(age);
        System.out.println(address);
        System.out.println("Borrowed items: " + numberOfBorrowedItems);
    }
    String rentItem(Items item){
        if(item.getItemsAmount() > 0 ){
            System.out.println("Item is ready to rent");
            item.setItemsAmount(1);
            numberOfBorrowedItems ++;
            System.out.println("Id items: " +  item.getId());
        }else {
            return "There is no item available";
        }
        return "Item borrowed";
    }
    void getLoan(){
        System.out.println("This client has " + numberOfBorrowedItems + " items on loan");

    }
    void returnItem(Items item){
        if (LocalDate.now().isAfter(item.getReturnDate())) {
            if(LocalDate.now().getYear() - item.getReturnDate().getYear() > 1) {
                System.out.println(" 1 The deadline expired more than a year ago. Customer must buy this book and pay penalty. Price is : " + item.getPrice() + 200);
            }
            else if (LocalDate.now().getYear() - item.getReturnDate().getYear() <= 1){
                int deadlineMonth = item.getReturnDate().getMonthValue();
                int returningMonth = LocalDate.now().getMonthValue();

                if (deadlineMonth - returningMonth < 0){
                    System.out.println(" 2 The deadline expired more than a year ago. Customer must buy this book and pay. Price is : " + item.getPrice() + 200);
                }
                else {
                    int numberOfDays = 366 - item.getReturnDate().getDayOfYear();

                    if (numberOfDays + LocalDate.now().getDayOfYear() > 366){
                        System.out.println(" 3 The deadline expired more than a year ago. Customer must buy this book and pay penalty. Price is : " + item.getPrice() + 200);
                    } else if (numberOfDays + LocalDate.now().getDayOfYear() <= 366) {
                        System.out.println("The Deadline expired, penalty is : " + (numberOfDays + LocalDate.now().getDayOfYear() * 0.10));
                    }

                }
            }
        }else{
            System.out.println("Item returned correctly");
            numberOfBorrowedItems--;
        }
    }
    int getNumberOfBorrowedItems(){
        return numberOfBorrowedItems;

    }

}

