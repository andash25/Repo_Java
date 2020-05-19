package class8pkg;

public class output {
    public static void main(String[] args) {
        printer myp = new printer();
        myp.printsummary();
        myp.print(80);
        myp.print(10,"double");
        myp.checktoner();
        myp.print(-1);
        myp.print(-1,"double");
        myp.print(1);
        myp.checktoner();
        myp.addtoner(-10);
        myp.addtoner(150);
        myp.addtoner(5);
        myp.addpages(-10);
        myp.addpages(150);
        myp.addpages(5);
        myp.printsummary();
    }

}
