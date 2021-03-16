package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */

public class BookShopTest {
	BookShop myBookShoop = new BookShop("My Book Shop");
    

//    @Test
//    public void myTest(){
//        assertTrue(false);
//    }
	 @Test
	    public void myZeroTest(){
	    	assertEquals(0,myBookShoop.cost(new int[]{0,0,0,0,0}));
	    }
    @Test
    public void myFirstTest(){
    	assertEquals(8*1,myBookShoop.cost(new int[]{1,0,0,0,0}));
    }
    @Test
    public void mySecondTest(){
    	assertEquals(8*2*(93/100.0),myBookShoop.cost(new int[]{1,1,0,0,0}));
    }
    @Test
    public void myThirdTest(){
    	assertEquals(8*3*(86/100.0),myBookShoop.cost(new int[]{1,1,1,0,0}));
    }
    @Test
    public void myFourthTest(){
    	assertEquals(8*4*(72/100.0),myBookShoop.cost(new int[]{1,1,1,1,0}));
    }
    @Test
    public void myFifthTest(){
    	assertEquals(8*5*(65/100.0),myBookShoop.cost(new int[]{1,1,1,1,1}));
    }
    @Test
    public void mySixthTest(){
    	assertEquals(8*5*(65/100.0)+8*1,myBookShoop.cost(new int[]{2,1,1,1,1}));
    }
    @Test
    public void mySeventhTest(){
    	assertEquals(8*5*(65/100.0)+8*2,myBookShoop.cost(new int[]{2,2,1,1,1}));
    }
    @Test
    public void myEigthTest(){
    	assertEquals(8*5*(65/100.0)+8*20,myBookShoop.cost(new int[]{5,5,5,5,5}));
    }
    
}