package PhoneNumber;

public class Contact {
// Attribute
private String name;
private int phoneNumber;

// Constructor
public Contact(String name, int phoneNumber) {
  this.name = name;
  this.phoneNumber = phoneNumber;
}

  public Contact(String name) {
    this.name = name;
  }

// Getter, Setter
public String getName() {
  return name;
}

public void setName(String name) {
  this.name = name;
}

public int getPhoneNumber() {
  return phoneNumber;
}

public void setPhoneNumber(int phoneNumber) {
  this.phoneNumber = phoneNumber;
}

//Method
@Override
public String toString() {
  return "Contact [Name:" + name + ", Phone Number:" + phoneNumber + "]";
}

}