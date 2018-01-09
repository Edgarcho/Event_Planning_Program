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
    public void newEvent_getsTotal_0() {
        Event testEvent = new Event(1,"buffet","full bar","dj");
        assertEquals(0,testEvent.getsTotal());
    }
   @Test
    public void plateCost_getGuestTotal_10() {
        Event testEvent = new Event(1,"buffet","full bar","dj");
        assertEquals(10, testEvent.plateCost());
    }

    @Test
    public void grandTotal_getGuestTotal_10() {
        Event testEvent = new Event(1,"buffet","full bar","dj");
        assertEquals(10,testEvent.grandTotal());
    }
}