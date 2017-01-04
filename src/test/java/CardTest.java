
/**
 * Created by edina on 2017.01.04..
 */
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    Card card1, card2;

    @After
    public void tearDown() throws Exception {
        card1 = null;
        card2 = null;
    }

    @Test
    public void Test_getValue_SimpleValues_ReturnsInteger() throws Exception {
        card1 = new Card("h4");
        card2 = new Card("sq");
        assertEquals(card1.getValue(), 4);
        assertEquals(card2.getValue(), 12);
    }

    @Test (expected = IllegalArgumentException.class)
    public void Test_CardObject_WrongColor_ThrowsIllegalArgumentException() {
        card1 = new Card("l8");
    }

    @Test (expected = IllegalArgumentException.class)
    public void Test_CardObject_BigValue_ThrowsIllegalArgumentException() {
        card1 = new Card("s23");
    }

    @Test (expected = IllegalArgumentException.class)
    public void Test_CardObject_SmallValue_ThrowsIllegalArgumentException() {
        card1 = new Card("h1");
    }

    @Test (expected = IllegalArgumentException.class)
    public void Test_CardObject_WrongValue_ThrowsIllegalArgumentException() {
        card1 = new Card("sl");
    }

}