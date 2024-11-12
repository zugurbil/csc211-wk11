import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
public class MapsDemo2 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101, "Alpha");
        map1.put(102, "Beta");
        map1.put(103, "Gamma");
        map1.put(104, "Delta");
        map1.put(105, "Epsilon");
        
        // for loop
        // The keySet() method in Java is used to 
        // retrieve a set view of the keys contained in a map.
        System.out.println("map1****************************"); 
        for (Integer key : map1.keySet()) {
            System.out.println("key : " + key + ", Name: " + map1.get(key));
        }
        
        
        Map<String, String> map2 = new HashMap<>();
        map2.put("101", "John");
        map2.put("102", "Susan");
        map2.put("103", "Patrick");
        map2.put("104", "Maya");
        map2.put("105", "Leo");
        System.out.println("map2****************************"); 
        for (String key1 : map2.keySet()) {
            System.out.println("key : " + key1+ ", Name: " + map2.get(key1));
        }
        
        //HashMap put() is a method that inserts a key-value pair to the hashmap. 
        //It adds the specified value against the specified key inside the hashmap.
        map1.put(101,"Apha");
        map2.put("101","John");
        
        Map<String, String> map3 = new HashMap<>();
        map3.putAll(map2);
        
        
        map3.remove("104");
        System.out.println("the size of map3 after remove " + map3.size());
        System.out.println("the value of the removed item  " + map3.get("104"));
        
        map3.replace("105", "Zihni");
        
        
               
       // Create an Iterator for the entry set
       // The keySet() method in Java is used to 
       // retrieve a set view of the keys contained in a map.
        Iterator<String> iterator = map3.keySet().iterator();
        while (iterator.hasNext()) {
            // Get the next key
            String nextKey = iterator.next();
            // Print the key and value
            System.out.println("Key : " + nextKey + ", " + " Name: " + map3.get(nextKey));
        }
       

     // Create an Iterator for the entry set
     // The keySet() method in Java is used to 
     // retrieve a set view of the keys contained in a map.
        Iterator<Integer> it = map1.keySet().iterator();
        while (it.hasNext()) {
            // Get the next key
            Integer nxtKey = it.next();
            // Print the key and value
            System.out.println("Key : " + nxtKey + ", " + " Name: " + map1.get(nxtKey));
        }
       
        // for loop
        // The keySet() method in Java is used to 
        // retrieve a set view of the keys contained in a map.
        for (Integer key : map1.keySet()) {
            System.out.println("key : " + key + ", Name: " + map1.get(key));
        }
          
        
        Map<Integer, String> mapT= new TreeMap<>();
		mapT.put(101, "AlphaT");
        mapT.put(102, "BetaT");
        mapT.put(103, "GammaT");
        mapT.put(104, "DeltaT");
        mapT.put(105, "EpsilonT");
        System.out.println("mapT****************************"); 
        for (Integer key : mapT.keySet()) {
            System.out.println("key : " + key + ", Name: " + mapT.get(key));
        }
        
        System.out.println("mapT with entry  option ****************************"); 
        for (Map.Entry<Integer, String> entry : mapT.entrySet()) {
            System.out.println("key : " +entry.getKey()+ ", Name: " +entry.getValue() );
        }
	}
}
