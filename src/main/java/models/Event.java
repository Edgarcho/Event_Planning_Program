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
            int mealOptionOne = 200;
            return mealOptionOne;
        } else if (this.food.equals("Three-course meal")){
            int mealOptionTwo = 100;
            return mealOptionTwo;
        } else if (this.food.equals("Light snack")){
            int mealOptionThree = 50;
            return mealOptionThree;
        } else {
            return 0;
        }
    }
    public int drinkTotal(){
        if(this.drink.equals("Unlimited")){
            int drinkOptionOne = 200;
            return drinkOptionOne;
        }else if(this.drink.equals("Two-drinks limit")){
            int drinkOptionTwo = 100;
            return drinkOptionTwo;
        }else if(this.drink.equals("Water only")){
            int drinkOptionThree = 50;
            return drinkOptionThree;
        }else{
            return 0;
        }
    }
    public int entertainmentTotal() {
        if (this.entertainment.equals("DJ")) {
            int entertainmentOptionOne = 200;
            return entertainmentOptionOne;
        }else if(this.entertainment.equals("Magician")) {
            int entertainmentOptionOne = 100;
            return entertainmentOptionOne;
        }else if(this.entertainment.equals("Surprise Me")){
            int entertainmentOptionOne = 50;
            return entertainmentOptionOne;
        }else{
            return 0;
        }
    }
    public int grandTotal(){
        int totalPrice = plateCost() + foodTotal() + drinkTotal() + entertainmentTotal();
        this.total = totalPrice;
        return this.total;
    }
    public int couponCode(){
        int discount = 100;
        int totalPrice = plateCost() + foodTotal() + drinkTotal() + entertainmentTotal() - discount;
        this.total = totalPrice;
        return this.total;
    }
    public int couponCodeTwo(){
        //int totalPrice = plateCost() + foodTotal() + entertainmentTotal();
        //this.total = totalPrice;
        //return this.total;
        return 0;
    }
}
