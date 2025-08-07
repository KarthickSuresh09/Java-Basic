package Collection_Task;

import java.util.ArrayList;
import java.util.HashMap;

public class ch {
	

	    public static void main(String[] args) {
	        // Create an ArrayList
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Mango");
	        list.add("Orange");

	        // Create an empty HashMap
	        HashMap<Integer, String> map = new HashMap<>();

	        // Transfer data using a loop
	        for (int i = 0; i < list.size(); i++) {
	            map.put(i, list.get(i));
	        }

	        // Print the HashMap
	        for (Integer key : map.keySet()) {
	            System.out.println("Key: " + key + ", Value: " + map.get(key));
	        }
	    }
	}


