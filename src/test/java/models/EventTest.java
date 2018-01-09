package models;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event(1, "buffet", "full bar", "dj");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_getsGuest_1() {
        Event testEvent = new Event(1,"buffet","full bar","dj");
        assertEquals(1, testEvent.getsGuest());
    }

    @Test
    public void newEvent_getsFood_buffet() {
        Event testEvent = new Event(1,"buffet","full bar","dj");
        assertEquals("buffet", testEvent.getsFood());
    }

    @Test
    public void newEvent_getsDrink_fullBar() {
        Event testEvent = new Event(1,"buffet","full bar","dj");
        assertEquals("full bar", testEvent.getsDrink());
    }

    @Test
    public void newEvent_getsEntertainment_dj() {
        Event testEvent = new Event(1,"buffet","full bar","dj");
        assertEquals("dj", testEvent.getsEntertainment());
    }

    @Test
    public void name() {
    }
/*    @Test
    public void newEvent_guestCost_7() {
        Event testEvent = new Event(1, 1, 1, 1);
        assertEquals(7, testEvent.guestCost(1));
    }

    @Test
    public void newEvent_totalCost_7() {
        Event testEvent = new Event(1,1,1,1);
        assertEquals(7,testEvent.totalCost(1));
    }
 */
}