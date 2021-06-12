public class Furniture {
    private String bedSize;
    private String table;
    private String acTon;
    private String led;
    private Curtons curton;

    public Furniture(String bedSize, String table, String acTon, String led,Curtons curton) {
        this.bedSize = bedSize;
        this.table = table;
        this.acTon = acTon;
        this.led = led;
        this.curton=curton;
    }


    public void furn()
    {
        System.out.println("funiture include \n bed with bedsize of="+bedSize+"\n table "+table+"\n Ac of "+acTon+"\n Led tv of size"+led );
    }
    public Curtons getCurton() {
        return curton;
    }

    public String getBedSize() {
        return bedSize;
    }

    public String getTable() {
        return table;
    }

    public String getAcTon() {
        return acTon;
    }

    public String getLed() {
        return led;
    }
}
