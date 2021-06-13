public class main {
    public static void main(String[] args) {
        Printer printer=new Printer(50,true);
        System.out.println("initial page count "+printer.getNumberOfPages());
        int pagesPrinted = printer.printPages(6);
        System.out.println("pages orunte was "+ pagesPrinted + "new total print cunt for printer  " + printer.getNumberOfPages());
    }
}
