package class8pkg;

import org.w3c.dom.ls.LSOutput;

public class printer {

    public static int maxPages = 100;
    public static int maxToner = 100;

    public void addtoner (int tonercount){
        if ( tonercount + maxToner < 100 && tonercount > 0) {
            maxToner = tonercount + maxToner;
        }
        else if (tonercount <0){
            System.out.println(" Invalid request: Cannot add negative number of toners");
        }
        else {
            System.out.println(" toner not added as the toner count " + tonercount + " exceeds the max capacity of " + (100-maxToner) );
        }
    }
    public void addpages (int pagecount){
        if ( pagecount + maxPages < 100 && pagecount > 0) {
            maxPages = pagecount + maxPages;
        }
        else if (pagecount <0){
            System.out.println(" Invalid request - Cannot add negative number of pages");
        }
        else {
            System.out.println(" pages not added as the page count " + pagecount + " exceeds the max capacity of " + (100-maxPages) );
        }

    }
    public void print (int numofpages ){
            if (numofpages > 0 && numofpages < maxPages){
                maxPages = maxPages - numofpages;
                maxToner = maxToner - numofpages;
                System.out.println(" Print " + numofpages + " single - sided");
                System.out.println("Pages =" + maxPages);
                System.out.println("Toner =" + maxToner);
            }
    }
    public void print (int numofpages, String printtype){
            if (numofpages > 0 && numofpages < maxPages){
                maxPages = maxPages - numofpages/2;
                maxToner = maxToner - numofpages;
                System.out.println(" Print " + numofpages + " double-sided");
                System.out.println("Pages =" + maxPages);
                System.out.println("Toner =" + maxToner);
            }
    }
    public void checktoner (){
        if(maxToner < 10){
            System.out.println(" Toner less than 10: Please add toner");
        }

    }
    public void printsummary (){
        System.out.println(" Toner Level: " + maxToner);
        System.out.println(" Pages in Tray: " + maxPages);

    }
    /**
     * Create a printer
     *
     * max toner level = 100
     * max pages in tray = 100
     * with 1 page printing, 1 toner is being used
     *
     * 1. addToner
     * 2. addPages
     * 3. Print (single and double)
     * 4. PrinterSummary
     *      Toner level:
     *      Pages count in tray:
     * 5. checkToner
     *      if toner is less than 10; it should warn to "Add toner"
     */
    /**
     * maxPages = 100
     * maxToner = 100
     *
     * print 10 - singled sided
     * pages=90
     * toner=90
     *
     * print 9 - double sided
     * pages=85
     * toner=81
     *
     * printSummary()
     * Toner level: 81
     * Pages in tray: 85
     *
     * print 2 - double sided
     * pages=84
     * toner=79
     *
     * printSummary()
     * Toner level: 79
     * Pages in tray: 84
     *
     *
     */
}
