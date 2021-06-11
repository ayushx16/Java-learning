public class main {
    public static void main(String[] args) {

        //first inheritance
        car ob= new car("TATA",4,8);
        

        //now composition


        Dimensions dimensions=new Dimensions(24,24,6);
        Case theCase=new Case("220b","Dell","240",dimensions);
        Monitor theMonitor=new Monitor("27inch Beast","MSI",27,new Resolution(2540,1550));

        Motherboard theMotherboard= new Motherboard("45-2@d","Acer",5,6,"v334");

        PC thePC= new PC(theCase,theMonitor,theMotherboard);

        //now to access methods from motherboard without using super or overriditing methods
        thePC.getMonitor().drawPixelAt(1600,1800,"Red");
        thePC.getMotherboard().loadProgram("Windows 10.4.1");
        thePC.getTheCase().pressPowerButton();

    }
}
