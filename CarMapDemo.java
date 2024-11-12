import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CarMapDemo {
	public static void main(String[] args) {
        // Create a HashSet of Car objects
        Map<String, Car> carMap = new HashMap<>();

        // Add 4 Car objects to the set
        Car honda = new Car("1HGCM82633A123456", "Honda Accord");
        Car toyota = new Car("1HGCM82633A123457", "Toyota Camry");
        Car mustang = new Car("1HGCM82633A123458", "Ford Mustang");
        Car tesla = new Car("1HGCM82633A123459", "Tesla Model S");
        
        carMap.put(toyota.getVin(), toyota);
        carMap.put(mustang.getVin(), mustang);
        carMap.put(honda.getVin(), honda);
        carMap.put(tesla.getVin(), tesla);
        
        
        System.out.println("carMap  ****************************"); 
        for (String key1 : carMap.keySet()) {
            System.out.println("key : " + key1+ ", Name: " + carMap.get(key1));
        }
        
        System.out.println("searching for the car with VIN : " + mustang.getVin());
        
        Car foundCar= carMap.get(mustang.getVin());
        
        if(foundCar != null )
        	System.out.println(foundCar);
        else
        	System.out.println("The Mustang is not in the set");
        
        System.out.println("searching for the car a specific  VIN  ");
        foundCar= carMap.get("1HGCM82633A123456");
        
        if(foundCar != null )
        	System.out.println(foundCar);
        else
        	System.out.println("The car is not in the set");
        
        
        System.out.println("searching for the car  VIN=1HGCM82633A123499  ");
        foundCar= carMap.get("1HGCM82633A123499");
        
        if(foundCar != null )
        	System.out.println(foundCar);
        else
        	System.out.println("The car is not in the set");
        
        
        
	}
}
