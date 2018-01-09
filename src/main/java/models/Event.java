package models;

public class Event {
    private int guest;
    private String food;
    private String drink;
    private String entertainment;
    private int total;

    public Event(int guest, String food, String drink, String entertainment){
        this.guest = guest;
        this.food = food;
        this.drink = drink;
        this.entertainment = entertainment;
        this.total = 0;
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
        return this.total;
    }
    public int plateCost(){
        int platePerPerson = 10;
        int guestTotal = this.guest*platePerPerson;
        return guestTotal;
    }
}
