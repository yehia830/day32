import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Yehia830 on 9/21/16.
 */
public class logic2Test {
    @Before
    public void setUp() throws Exception {
        logic2 logic= new logic2();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void loneSum() throws Exception {

    }

    @Test
    public void closeFar() throws Exception {
      boolean testflag = logic2.closeFar(1,2,10);
        assertEquals(true, testflag);
    }
    @Test
    public void closefaraseasyas() throws Exception {
        boolean testflag = logic2.closeFar(1,2,3);
        assertEquals(false, testflag);
    }
    @Test
    public void closefarnegaitve() throws Exception {
        boolean testflag = logic2.closeFar(-1,10,0);
        assertEquals(true, testflag);
    }
    @Test
    public void closefarbigfirst() throws Exception {
        boolean testflag = logic2.closeFar(10,2,9);
        assertEquals(true, testflag);
    }
    @Test
    public void closefarbigfirstbutmiddleisclose() throws Exception {
        boolean testflag = logic2.closeFar(10,8,9);
        assertEquals(false, testflag);
    }
    @Test
    public void closefartworeallysmallonereallybig() throws Exception {
        boolean testflag = logic2.closeFar(10000,10001,23);
        assertEquals(true, testflag);
    }

    @Test
    public void closefarallnumbersareclosebuttooclose() throws Exception {
        boolean testflag = logic2.closeFar(6,4,5);
        assertEquals(false, testflag);
    }
    @Test
    public void closefarnumbersareclosebutnotcloseenough() throws Exception {
        boolean testflag = logic2.closeFar(11,8,14);
        assertEquals(false, testflag);
    }

    @Test
    public void luckySum() throws Exception {
        int sum =  logic2.luckySum(1,2,13);
        assertEquals(3,sum);
    }


    @Test
    public void luckySumregualarnumbers() throws Exception {
        int sum =  logic2.luckySum(1,2,3);
        assertEquals(6,sum);
    }

    @Test
    public void luckySum13inthefront() throws Exception {
        int sum =  logic2.luckySum(13,2,13);
        assertEquals(0,sum);
    }

    @Test
    public void luckySum13inthemiddle() throws Exception {
        int sum =  logic2.luckySum(11,13,6);
        assertEquals(11,sum);
    }

    @Test
    public void luckySumallzeros() throws Exception {
        int sum =  logic2.luckySum(0,0,0);
        assertEquals(0,sum);
    }



}