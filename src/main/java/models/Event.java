package models;

public class Event {
    private int guest;
    private int food;

    public Event(int guest, int food, int drink, int entertainment){
        this.guest = guest;
        this.food = food;
    }
    public int getsGuest(){
        return this.guest;
    }
    public int getsFood(){
        return this.food;
    }
}
