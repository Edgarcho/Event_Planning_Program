package models;

public class Event {
    private int guest;

    public Event(int guest, int food, int drink, int entertainment){
        this.guest = guest;
    }
    public int getsGuest(){
        return this.guest;
    }
}
