import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageLibrary{
    static List<Book> manageLibrary = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    // Function add book
public static void addBook (){
      System.out.print("Enter id: ");
      String idBook = sc.nextLine();
      System.out.print("Enter name: ");
      String nameBook = sc.nextLine();
      System.out.print("Enter author: ");
      String author = sc.nextLine();
      System.out.print("Enter quantity: ");
      int quantity = sc.nextInt();
      sc.nextLine();
      
      Book book = new Book(idBook, nameBook, author, quantity);
      manageLibrary.add(book);
      System.out.println("Add successfully!");
    }

    public static void borrowBook (){
      System.out.print("Enter the name of book you want to borrow: ");
      String nameBook = sc.nextLine();
      boolean found = false;
      for (Book book : manageLibrary){
        if (book.getNameBook().equalsIgnoreCase(nameBook) ){
            found = true;

            if(book.getQuantity() > 0){
                book.setQuantity(book.getQuantity() - 1);
                System.out.println("Borrow successfully: "+book.getNameBook());
            }else {
                System.out.println("The book is out of stock.");
            }
            break;
        }
      }
      if (!found){
          System.out.println("Book not found.");
      }
    }
    
    public static void informationBook (){
        if (manageLibrary.isEmpty()){
            System.out.println("No books found.");
        }else {
            for (Book book : manageLibrary){
                System.out.println("Information of book: " + book);
            }
        }
    }
    
    public static void main(String[] args) {
    int choice;
    
    do{
    System.out.println("-----Menu-----");
    System.out.println("1.Add book.");
    System.out.println("2.Borrow book.");
    System.out.println("3.Information of book.");
    System.out.println("4.Exit.");
    System.out.print("Enter your choice: ");
    choice = sc.nextInt();
    sc.nextLine();

    switch (choice){
      case 1:
      System.out.println("ADD INFORMATION OF BOOK!");
      addBook();
      break;

      case 2:
      borrowBook();
      break;

      case 3:
      informationBook();
      break;

      case 4:
      System.out.println ("Goodbye");
      break;

      default:
      System.out.println ("Invalid choice.");

    }
  }while (choice != 4);
}
}


