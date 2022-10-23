public class ContactServiceTest {
	public static void main(String[] args) {
		
		ContactService contactService = new ContactService();
		
		Contact c1 = new Contact("C1", "Sara", "Chinna", "9976578987", "Ashofrd Gables, USA");
		Contact c2 = new Contact("C2", "Jess", "Neha", "5654267654", "Dunwoody Gables, USA");
		
		// Add contacts to service 
		if(contactService.addContact(c1)) {
			System.out.println("C1 added");
		}
		else {
			System.out.println("C1 NOT added");
		}
		
		if(contactService.addContact(c2)) {
			System.out.println("C2 added");
		}
		else {
			System.out.println("C2 NOT added");
		}
		
		if(contactService.addContact(c1)) {
			System.out.println("C1 added");
		}
		else {
			System.out.println("C1 NOT added");
		}
		
		// Show all the contacts
		System.out.println();
		contactService.displayAllContacts();
		
		//Delete a contact
		System.out.println();
		if(contactService.deleteContact("C1")) {
			System.out.println("Deleted C1");
		}
		else {
			System.out.println("Deleted C1");
		}
		
		contactService.updateContactFirstName("C2", "Jessica");
		contactService.updateContactLastName("C2", "Nehaj");
		contactService.updateContactNumber("C2", "4123457653");
		contactService.updateContactAddress("C2", "Dunwoody Dr, GA");
		
		System.out.println();
		contactService.displayAllContacts();
	}
}