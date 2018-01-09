package models;

public class Event {
    private int guest;
    private String food;
    private String drink;
    private String entertainment;

    public Event(int guest, String food, String drink, String entertainment){
        this.guest = guest;
        this.food = food;
        this.drink = drink;
        this.entertainment = entertainment;
    }
    public int getsGuest(){
        return this.guest;
    }
    public String getsFood(){
        return this.food;
    }
    public String getsDrink(){
        return this.drink;
    }
    public String getsEntertainment(){
        return this.entertainment;
    }
    public int getsTotal(){
        return -1;
    }
    /*
    public int guestCost(int totalGuest){
        int guestPlateCost = 7;
        int guestTotal = this.guest * guestPlateCost;
        return guestTotal;
    }
    public int totalCost(int guestTotal){
        int total = guestTotal + 0;
        return total;
    }
    */
}
