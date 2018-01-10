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
    public int foodTotal() {
        if (this.food.equals("Buffet")) {
            int mealPrice = 200;
            return mealPrice;
        } else if (this.food.equals("Three-course meal")){
            int mealPrice = 100;
            return mealPrice;
        } else if (this.food.equals("Light snack")){
            int mealPrice = 50;
            return mealPrice;
        } else {
            return 0;
        }
    }
    public int drinkTotal(){
        if(this.drink.equals("Unlimited")){
            int drinkFee = 200;
            return drinkFee;
        }else{
            return 0;
        }
    }
    public int entertainmentTotal(){
        if(this.entertainment.equals("DJ")){
            int entertainmentFee = 200;
            return entertainmentFee;
        }else{
            return 0;
        }
    }
    public int grandTotal(){
      int totalPrice = plateCost() + foodTotal() + drinkTotal() + entertainmentTotal();
      this.total = totalPrice;
      return this.total;
    }
}
