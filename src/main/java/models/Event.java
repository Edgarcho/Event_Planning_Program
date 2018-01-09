package models;

public class Event {
    private int guest;
    private int food;
    private int drink;


    public Event(int guest, int food, int drink, int entertainment){
        this.guest = guest;
        this.food = food;
        this.drink = drink;
    }
    public int getsGuest(){
        return this.guest;
    }
    public int getsFood(){
        return this.food;
    }
    public int getsDrink(){
        return this.drink;
    }
    public int getsEntertainment(){
        return 0;
    }
}
