import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName) {

        for (Restaurant res : restaurants) {
            if (res.getName().equals(restaurantName)) {
                return res;
            } //else {
//                try {
//                    throw new restaurantNotFoundException("Restaurant could not be found");
//                } catch (restaurantNotFoundException e) {
//                    e.printStackTrace();
//                }
           // }
        }
        return null;
        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
