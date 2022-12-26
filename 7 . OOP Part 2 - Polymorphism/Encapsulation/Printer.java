package Encapsulation;
public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;

        if (tonerLevel < -1 || tonerLevel > 100){
            this.tonerLevel = -1;
        }
    }
    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            if (tonerLevel + tonerAmount > 100){
                return -1;
            }
            else {
                return tonerLevel += tonerAmount;
            }
        }
        return -1;
    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.duplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

