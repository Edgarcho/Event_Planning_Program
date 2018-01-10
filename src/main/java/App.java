import models.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
        boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to our Portland Event Planning Service. What would you like to do? Enter one of the following options: New Event or Exit");
            try {
                String navigationChoice = bufferedReader.readLine();
                if (navigationChoice.equals("New Event")) {
                    System.out.println("Alright, let's create a new event! How many guest will attend this event?");
                    int userGuest = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Great! What kind of food service do you want?");
                    System.out.println("We offer: Buffet, Three-course meal, or Light snack");
                    String userFood = bufferedReader.readLine();
                    System.out.println("Got it! What kind of drink service do you want?");
                    System.out.println("We offer: Unlimited, Two-drinks limit, or Water only");
                    String userDrink = bufferedReader.readLine();
                    System.out.println("Finally, what kind of entertainment do you want?");
                    System.out.println("We offer: DJ, Magician or Surprise Me");
                    String userEntertainment = bufferedReader.readLine();
                    Event userEvent = new Event(userGuest, userFood, userDrink, userEntertainment);
                    System.out.println("Alright, here's your new event");
                    System.out.println("----------------------");
                    System.out.println("Guest Attending: " + userEvent.getGuest() + "|Cost for service: $" + userEvent.plateCost());
                    System.out.println("Food Service: " + userEvent.getFood() + "|Cost for service: $" + userEvent.foodTotal());
                    System.out.println("Drink Service: " + userEvent.getDrink() + "|Cost for service: $" + userEvent.drinkTotal());
                    System.out.println("Entertainment Service: " + userEvent.getEntertainment() + "|Cost per service: $" + userEvent.entertainmentTotal());
                    System.out.println("Grand Total: $" + userEvent.grandTotal());
                    System.out.println("----------------------");
                    System.out.println("Free coupon codes: Enter either New user or Surprise");
                    String couponCode = bufferedReader.readLine();
                        if(couponCode.equals("New user")){
                            System.out.println("----------------------");
                            System.out.println("Congratulations this code will take $100 off the total");
                            System.out.println("Grand Total: $" + userEvent.couponCode());
                        }else if(couponCode.equals("Surprise")){
                            System.out.println("----------------------");
                            System.out.println("Congratulations drinks are on us!!!");
                            System.out.println("Grand Total: $" + userEvent.couponCodeTwo());
                        }else{
                            System.out.println("I'm sorry, we don't recognize your coupon code");
                            System.out.println("Grand Total: $" + userEvent.grandTotal());
                        }
                } else if (navigationChoice.equals("Exit")) {
                    System.out.println("Thank you for visiting!");
                    System.out.println("Goodbye!");
                    programRunning = false;
                } else {
                    System.out.println("I'm sorry, we don't recognize your input");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

