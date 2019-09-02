import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() { printer = new Printer(100, 100); }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.paperCount());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.tonerCheck());
    }

    @Test
    public void printReducesPaper(){
        assertEquals(90 & 90, printer.print(10, 1));
    }

    @Test
    public void notEnoughPaper(){
        assertEquals(100 & 100, printer.print(10, 20));
    }



}
