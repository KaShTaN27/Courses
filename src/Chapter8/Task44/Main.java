package Chapter8.Task44;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("6666666");
        phone.addNewContact(new Contact("Tanya", "4325234"));
        Contact cont2 = new Contact("Vitya", "6141267");
        Contact cont3 = new Contact("Anton", "9693631");
        phone.addNewContact(cont2);
        phone.addNewContact(cont3);
        phone.updateContact(phone.queryContact("Tanya"), new Contact("Sofia", "6969692"));
        phone.printContacts();
    }
}
