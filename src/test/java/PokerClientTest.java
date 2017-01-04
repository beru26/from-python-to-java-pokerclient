import org.junit.After;

import static org.junit.Assert.*;

/**
 * Created by edina on 2017.01.04..
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PokerClientTest {
    PokerClient pokerClient;

    @Before
    public void setUp() throws Exception {
        pokerClient = new PokerClient("s3", "h5", "cJ", "d10", "sQ");
    }

    @After
    public void tearDown() throws Exception {
        pokerClient = null;
    }

    @Test
    public void Test_highestCardIsMine_SimpleValues_ReturnBoolean() throws Exception {
        assertEquals(pokerClient.highestCardIsMine("s4", "ha", "c10", "h8", "s7"), false);
        assertEquals(pokerClient.highestCardIsMine("c4", "s5", "d6", "sJ", "h10"), true);
    }

}