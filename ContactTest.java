public class ContactTest {
    
    Contact c1 = new Contact("C1", "Sara", "Chinna", "9976578987", "Ashofrd Gables, USA");
    Contact c2 = new Contact("C2", "Jess", "Neha", "5654267654", "Dunwoody Gables, USA");
    
    public void main(String[] args) {

    c1.getContactID();
    c1.getFirstName();
    c1.getLastName();
    c1.getPhoneNumber();
    c1.getAddress();

    c1.toString();

    c2.getContactID();
    c2.getFirstName();
    c2.getLastName();
    c2.getPhoneNumber();
    c2.getAddress();

    c2.toString();
    
    }
}
