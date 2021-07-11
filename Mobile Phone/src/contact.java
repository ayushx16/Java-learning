public class contact {
    private String name;
    private String phno;

    public contact(String name, String phno) {
        this.name = name;
        this.phno = phno;
    }

    public String getName() {
        return name;
    }

    public String getPhno() {
        return phno;
    }
    public static contact createContact(String name,String phone){
        return new contact(name,phone);
    }
}
