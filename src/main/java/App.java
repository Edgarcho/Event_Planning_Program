import models.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
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
                System.out.println("We offer: Unlimited, Two-drinks limited, or Water only");
                String userDrink = bufferedReader.readLine();
                System.out.println("Finally, what kind of entertainment do you want?");
                System.out.println("We offer: DJ, Magician or Surprise Me");
                String userEntertainment = bufferedReader.readLine();
                Event userEvent = new Event(userGuest,userFood,userDrink,userEntertainment);
                    System.out.println("Alright, here's your new Event");
                    System.out.println( "----------------------" );
                    System.out.println(userEvent.getGuest());
                    System.out.println(userEvent.getFood());
                    System.out.println(userEvent.getDrink());
                    System.out.println(userEvent.getEntertainment());
                    System.out.println(userEvent.grandTotal());
            } else if (navigationChoice.equals("Exit")) {

            } else {
                System.out.println("I'm sorry, we don't recognize your input");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

