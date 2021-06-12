public class Pillow {
    private String pillowColor;
    private int noOfPillow;

    public Pillow(String pillowColor, int noOfPillow) {
        this.pillowColor = pillowColor;
        this.noOfPillow = noOfPillow;
    }
    public void pil()
    {
        System.out.println("PILLOW OF Color "+ pillowColor+"\n total no. of pillow"+noOfPillow);
    }

    public String getPillowColor() {
        return pillowColor;
    }

    public int getNoOfPillow() {
        return noOfPillow;
    }
}
