import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class CarMapDemo2 {
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
        
        
        System.out.println("carMap list with entry Method 1 ************************"); 
        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
           // System.out.println(entry );
         //   System.out.println("key : " +entry.getKey()+ ", Name: " +entry.getValue() );
            System.out.println(" Value: " +entry.getValue() );
            
         System.out.println("carMap list with entry Method 2 ************************");
         Set<Map.Entry<String, Car>> cars = carMap.entrySet();
         for (Map.Entry<String, Car> entry1 : cars) {
                System.out.println("key : " +entry1.getKey() ); 
                System.out.println( "Name: " + entry.getValue());
         }
        System.out.println("keys*******");
        Set<String> keys = carMap.keySet();
        for (String k : keys) {
                 System.out.println(k );}
        for (String k : keys) {
            System.out.println(carMap.get(k));}
        
        Collection<Car> values = carMap.values();
        System.out.println("values:*******");    
        for (Car c : values)
        	System.out.println(values);
        }
        
	}
}
