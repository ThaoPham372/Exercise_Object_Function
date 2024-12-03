package PhoneNumber;

import PhoneNumber.Contact;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class ManageListPhone {
  static List<Contact> managePhoneNumList = new ArrayList<>();
  static Scanner sc = new Scanner (System.in);

  public static void addContact (){
    System.out.print("Enter Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Phone Number: ");
    int phoneNumber = sc.nextInt();
    sc.nextLine();

    Contact contact = new Contact(name, phoneNumber);
    managePhoneNumList.add(contact);
    System.out.println("Add Contact Successfully!");
  }

  public static void findContactByName() {
    System.out.print("Enter Name to search: ");
    String name = sc.nextLine();

    boolean found = false;
    for (Contact contact : managePhoneNumList) {
      if (contact.getName().equalsIgnoreCase(name)) {
        System.out.println("Contact Found: "+contact.getName());
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Contact Not Found");
    }
  }

  public static void printList () {
    if (managePhoneNumList.isEmpty()) {
      System.out.println("No Contact Found");
    }else {
      for (Contact contact : managePhoneNumList) {
        System.out.println(contact);
      }
    }
  }

  public static void deleteContact(){
    System.out.print("Enter the name of contact you want to remove: ");
    String nameRemove = sc.nextLine();
    boolean found = false;
    for (Contact contact : managePhoneNumList){
      if (contact.getName().equalsIgnoreCase(nameRemove)) {
        managePhoneNumList.remove(contact);
        System.out.println("Contact Removed Successfully: "+contact.getName());
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Contact Not Found");
    }
  }  
  public static void main(String[] args) {
    int choice;
    do {
      System.out.println("-----Phone Menu-----");
      System.out.println("1.Add Contact.");
      System.out.println("2.Find Contact By Name.");
      System.out.println("3.Show list Contact.");
      System.out.println("4.Delete One Contact.");
      System.out.println("5.Exit.");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();
      sc.nextLine();
      switch (choice){
        case 1:
          addContact();
        break;
        case 2:
          findContactByName();
          break;
        case 3:
          printList();
          break;
        case 4:
          deleteContact();
          break;
        case 5:
        System.out.println("Goodbye!");
          break;
        default:
        System.out.println("Invalid choice!");
      }

    }while (choice != 5);
}
}
