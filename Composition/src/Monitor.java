public class Monitor {
    private String model;
    private String manufacturer;
    private int size;

    //composition
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x,int y,String Color){
        System.out.println("drawing pixel at "+x+ ","+y+ "int color" +Color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
