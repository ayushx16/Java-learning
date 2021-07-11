import java.util.ArrayList;

public class mobilePhone {
    private String myNumber;
    private ArrayList<contact> mycontact;

    public mobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.mycontact = new ArrayList<contact>();
    }

    public boolean addNewContact(contact cont) {
        if (findContact(cont.getName()) >= 0) {
            System.out.println("Contact is already in files");
            return false;
        }
        mycontact.add(cont);
        return true;
    }
    public boolean removeContact(contact cont){
        int foundPosition = findContact(cont);
        if (foundPosition < 0) {
            System.out.println(cont.getName() + " not found");
            return false;
        }
        this.mycontact.remove((foundPosition));
        System.out.println(cont.getName()+"was removed");
return true;

    }

    private int findContact(contact cont) {
        return this.mycontact.indexOf(cont);
    }

    public boolean updateContact(contact oldContact, contact newContact) {
        int findPosition = findContact(oldContact);
        if (findPosition < 0) {
            System.out.println(oldContact.getName() + " not found");
            return false;
        }
        this.mycontact.set(findPosition, newContact);
        System.out.println(oldContact.getName() + "was replaced with " + newContact.getName());
        return true;
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.mycontact.size(); i++) {
            contact cont = this.mycontact.get(i);
            if (cont.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public String queryContact(contact cont){
        if(findContact(cont)>0){
            return cont.getName();
        }
        return null;
    }
    public contact queryContact(String name){
        int position = findContact(name);
        if(position>=0){
            return this.mycontact.get(position);
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact list");
        for(int i=0;i<this.mycontact.size();i++){
            System.out.println((i+1) +" . " +
                    this.mycontact.get(i).getName() + "--> "+
                    this.mycontact.get(i).getPhno());
        }
    }

}


