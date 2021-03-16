package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */

public class BookShopTest {
	BookShop myBookShoop = new BookShop("My Book Shop");
    

    @Test
    public void myTest(){
        assertTrue(false);
    }
    @Test
    public void myFirstTest(){
    	assertEquals(8*1,myBookShoop.cost(new int[]{1,0,0,0,0}));
    }
}