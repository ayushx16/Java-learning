import java.util.function.BooleanSupplier;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPages;
    private Boolean duplex;

    public Printer(int tonerLevel, Boolean duplex) {
        if (tonerLevel >= 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.numberOfPages = 0;
    }

    public int addToner(int tonerAmt)
    {
        if(tonerLevel>0 && tonerAmt <=100)
        {
            if(this.tonerLevel + tonerAmt>100)
            {
                return -1;
            }
            this.tonerLevel +=tonerAmt;
            return this.tonerLevel;
        }
        else{
            return -1;
        }
    }
    public int printPages(int pages)
    {
        //we are printing on the sides of paper so we have to devide the number by 2
        int pagesToPrint =pages;
        if(this.duplex)
        {
            pagesToPrint /=2;
            System.out.println("printing the duplex node");
        }
        this.numberOfPages += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
