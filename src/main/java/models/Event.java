package models;

public class Event {
    private int guest;
    private int food;
    private int drink;
    private int entertainment;

    public Event(int guest, int food, int drink, int entertainment){
        this.guest = guest;
        this.food = food;
        this.drink = drink;
        this.entertainment = entertainment;
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
        return this.entertainment;
    }
    public int guestCost(int totalGuest){
        int guestPlateCost = 7;
        return this.guest * guestPlateCost;
    }
    public int totalCost(int guestTotal){
        return 0;
    }
}
