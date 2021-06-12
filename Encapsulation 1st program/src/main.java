public class main {
    public static void main(String[] args) {
        Player player=new Player("Incarnation",200);
        player.hit(50);
        System.out.println("initial health is "+player.getHealth());
    }
}
