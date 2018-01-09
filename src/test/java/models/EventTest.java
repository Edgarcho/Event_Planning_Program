package models;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event(1, 1, 1, 1);
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_getsGuest_1() {
        Event testEvent = new Event(1,1,1,1);
        assertEquals(1, testEvent.getsGuest());
    }

    @Test
    public void newEvent_getsFood_1() {
        Event testEvent = new Event(1,1,1,1);
        assertEquals(1, testEvent.getsFood());
    }
}