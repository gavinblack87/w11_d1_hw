public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int paperCount(){
        return this.paper;
    }

    public int tonerCheck(){
        return this.toner;
    }

    public int print(int pages, int copies){
        if (this.paper >= (pages * copies)){
            return this.paper - (pages * copies) & this.toner -(pages * copies);
        } else {
            return this.paper;
        }
    }



}
