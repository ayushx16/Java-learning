public class Player {
    private String name;
    private int HP =100;

    //if we want to change the name of variable we have to select it then press mouse right button
    //then refractor then change the name but remember do not change the getter name if you do so
    //then you have to change the in mainclass aksi
    public Player(String name, int health) {
        this.name = name;
        if(health>=0 && health<=100 ) {
            this.HP = health;
        }
    }

    public void hit(int hitpoint)
    {
        this.HP -=hitpoint;
        if(this.HP <=0) {
            System.out.println("player knocked out");
        }
    }



    public int getHealth() {
        return HP;
    }
}
