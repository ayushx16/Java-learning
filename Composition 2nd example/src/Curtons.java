public class Curtons {
    private String color;
    private int size;
    private int no_of_Curtons;

    private Pillow pillow;




    public Pillow getPillow() {
        return pillow;
    }

    public Curtons(String color, int size, int no_of_Curtons,Pillow pillow) {
        this.color = color;
        this.size = size;
        this.no_of_Curtons = no_of_Curtons;
        this.pillow = pillow;

    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getNo_of_Curtons() {
        return no_of_Curtons;
    }


}
