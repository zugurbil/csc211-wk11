import java.util.HashMap;
import java.util.Map;


public class MapsDemo1 {

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
        
        System.out.println("the size of map3 before remove " + map3.size());
        if(!map3.isEmpty())
            System.out.println("map3 is empty is not empty");
        
        System.out.println("101 in map3 ?  " + map3.containsKey("101"));
        System.out.println("106 in map3 ?  " + map3.containsKey("106"));
        
        System.out.println("Alpha in map3 ?  " + map3.containsValue("John"));
        System.out.println("Epsilon in map3 ?  " + map3.containsValue("Empsilon"));
        
        map3.remove("104");
        System.out.println("the size of map3 after remove " + map3.size());
        System.out.println("the value of the removed item  " + map3.get("104"));
        
        String oldValue = map3.get("105");
        map3.replace("105", "Zihni");
        System.out.println("key 105 old value is  " + oldValue+
        		" and the new vaue is " +  map3.get("105"));
        
        
       map3.clear();
       System.out.println("the size of after clear " + map3.size());
        
        
    	}
}