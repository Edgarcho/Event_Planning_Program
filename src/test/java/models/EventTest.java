package models;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event(1, "Buffet", "Unlimited", "DJ");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_getsGuest_1() {
        Event testEvent = new Event(1, "Buffet", "Unlimited", "DJ");
        assertEquals(1, testEvent.getsGuest());
    }

    @Test
    public void newEvent_getsFood_buffet() {
        Event testEvent = new Event(1, "Buffet", "Unlimited", "DJ");
        assertEquals("Buffet", testEvent.getsFood());
    }

    @Test
    public void newEvent_getsDrink_unlimited() {
        Event testEvent = new Event(1, "Buffet", "Unlimited", "DJ");
        assertEquals("Unlimited", testEvent.getsDrink());
    }

    @Test
    public void newEvent_getsEntertainment_dj() {
        Event testEvent = new Event(1, "Buffet", "Unlimited", "DJ");
        assertEquals("DJ", testEvent.getsEntertainment());
    }

    @Test
    public void newEvent_getsTotal_0() {
        Event testEvent = new Event(1,"Buffet","Unlimited","DJ");
        assertEquals(0,testEvent.getsTotal());
    }

    @Test
    public void plateCost_getGuestTotal_10() {
        Event testEvent = new Event(1,"Buffet","Unlimited","DJ");
        assertEquals(10, testEvent.plateCost());
    }

    @Test
    public void foodTotal_getFoodTotal_200() {
        Event testEvent = new Event(1,"Buffet","Unlimited","DJ");
        assertEquals(200,testEvent.foodTotal());
    }

    @Test
    public void drinkTotal_getDrinkTotal_200() {
        Event testEvent = new Event(1,"Buffet","Unlimited","DJ");
        assertEquals(200,testEvent.drinkTotal());
    }

    @Test
    public void entertainmentTotal_getEntertainmentTotal_200() {
        Event testEvent = new Event(1, "Buffet", "Unlimited", "DJ");
        assertEquals(200,testEvent.entertainmentTotal());
    }

    @Test
    public void grandTotal_getTotalFromAllField_610() {
        Event testEvent = new Event(1, "Buffet", "Unlimited", "DJ");
        assertEquals(610,testEvent.grandTotal());
    }

    @Test
    public void foodTotal_secondOption_100(){
        Event testEvent = new Event(1, "Three-course meal", "Unlimited", "DJ");
        assertEquals(100,testEvent.foodTotal());
    }

    @Test
    public void foodTotal_thirdOption_50() {
        Event testEvent = new Event(1, "Light snack", "Unlimited", "DJ");
        assertEquals(50,testEvent.foodTotal());
    }

    @Test
    public void drinkTotal_secondOption_100() {
        Event testEvent = new Event(1, "Buffet", "Two-drinks limit", "DJ");
        assertEquals(100,testEvent.drinkTotal());
    }

    @Test
    public void drinkTotal_thirdOption_50() {
        Event testEvent = new Event(1,"Buffet","Water only","DJ");
        assertEquals(50,testEvent.drinkTotal());
    }

    @Test
    public void entertainmentTotal_secondOption_100() {
        Event testEvent = new Event(1,"Buffet","Unlimited","Magician");
        assertEquals(100,testEvent.entertainmentTotal());
    }

    @Test
    public void entertainmentTotal_thirdOption_50() {
        Event testEvent = new Event(1,"Buffet","Unlimited","Surprise Me");
        assertEquals(50,testEvent.entertainmentTotal());
    }

    @Test
    public void couponCode_minusOneHundred_510() {
        Event testEvent = new Event(1,"Buffet","Unlimited","DJ");
        assertEquals(510,testEvent.couponCode());
    }

    @Test
    public void couponCodeTwo_freeDrink_410() {
        Event testEvent = new Event(1,"Buffet","Unlimited","DJ");
        assertEquals(410,testEvent.couponCodeTwo());
    }
}
