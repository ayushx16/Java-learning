import java.util.Scanner;

public class main {
    private static Scanner sc=new Scanner(System.in);
    private static mobilePhone mobilePhone=new mobilePhone("8318376348");
    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\n Enter actions : 6 to show available options");
            int actions =sc.nextInt();
            sc.nextLine();
            switch(actions) {
                case 0:
                    System.out.println("shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                default:
                    System.out.println("wrong choice");
            }
        }
    }
    private static void addNewContact(){
        System.out.println("Enter new Contact name: ");
        String name=sc.nextLine();
        System.out.println("Enter new contact number: ");
        String phone= sc.nextLine();
        contact newContact=contact.createContact(name,phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("new Contact added name ="+name + "phone = "+phone);
        }
        else{
            System.out.println("connot add "+ name +"already exist on file");           }
    }
    private static void updateContact(){
        System.out.println("Enter existing contact name :");
        String name=sc.nextLine();
        contact existingContactRecord=mobilePhone.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("contact not found");
            return;
        }
        System.out.println("Enter new Contact name: ");
        String newName=sc.nextLine();
        System.out.println("Enter new contact phone number");
        String newNumber=sc.nextLine();
        contact newRecord=contact.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingContactRecord,newRecord)){
            System.out.println("Successfully updated record");
        }
        else
            System.out.println("Error updating contact");

    }

    private static void removeContact() {
        System.out.println("Enter existing contact name :");
        String name = sc.nextLine();
        contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord))
        {
            System.out.println("Successfuully deletedd contact");
        }
        else{
            System.out.println("Error removing contact");
        }


    }

    private static void queryContact() {
        System.out.println("Enter existing contact name :");
        String name = sc.nextLine();
        contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("name: " + existingContactRecord.getName()+"phone number is "+existingContactRecord.getPhno());
    }






        private static void startPhone(){
        System.out.println("Starting phone.");
    }
    private static void printActions(){
        System.out.println("Available actions are: ");
        System.out.println("0 ~ to shutdown \n" +
                "1~ to print contact\n" +
                "2 ~ to add a new contact\n" +
                "3 ~ to update contact\n" +
                 "4 ~ to remove an existing contact\n" +
                "5 ~ query if an existing contact exists or not\n" +
                "6 ~ to print a list of available actions ");
        System.out.println("Choose your actions");
    }
}
