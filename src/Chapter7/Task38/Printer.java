package Chapter7.Task38;

public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel > -1 && tonerLevel <= 100 ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount) {
        return tonerAmount > 0 && tonerAmount <= 100 && tonerAmount + tonerLevel <= 100 ? tonerAmount + tonerLevel : -1;
    }
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = pages % 2 == 1 ? pages / 2 + 1 : pages / 2;
            System.out.println("Printing in duplex mode");
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
