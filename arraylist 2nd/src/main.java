import java.util.Scanner;

public class main {
    private static Scanner sc=new Scanner(System.in);
    private static List list=new List();
    public static void main(String[] args) {
        boolean exit=false;
        int ch=0;
        while(!exit){
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    list.display();
                    break;
                case 2:
                    System.out.println("Enter item");
                    String addit=sc.next();
                    list.additems(addit);
                    break;
                case 3:
                    System.out.println("for updatation enter position and item ");
                    int pos=sc.nextInt();
                    String it=sc.next();
                    list.update(pos,it);
                    break;
                case 4:
                    System.out.println("for deletion enter position");
                    int pp=sc.nextInt();
                    list.delete(pp);
                    break;
                case 5:
                    System.out.println("Enter item to search");
                    String itt=sc.next();
                    list.findItem(itt);
                    break;
                default:
                    System.out.println("Exit");
            }
        }

    }
}
