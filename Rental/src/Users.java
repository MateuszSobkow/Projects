public class Users extends Items{
    private String name, surname, address;
    private int age, numberOfBorrowedItems;
    Users(){
        System.out.println("Empty user");
    }
     Users(String name, String surname, String address, int age){
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
        item.getAll();
        if(item.getItemsAmount() > 0 ){
            System.out.println("Item is ready to rent");
            item.setItemsAmount(1);
            numberOfBorrowedItems += 1;
        }else {
            return "There is no item available";
        }
        return "Item borrowed";
    }
    void getLoan(){
        System.out.println("This client has " + numberOfBorrowedItems + " items on loan");

    }

}
