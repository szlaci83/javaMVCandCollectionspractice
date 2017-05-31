package CollectionsPractice;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import model.Car;

public class Maps {
	
	static void printMap(Map<Car, Integer> map){
			for (Map.Entry<Car, Integer> entry: map.entrySet()){
				Car key = entry.getKey();
				int value = entry.getValue();
				System.out.println(key + ":" + value);
			}
	}
	
	
	public static void main(String[] args) {
		//Not sorted, 
		//HashMap<Car, Integer> map = new HashMap<Car, Integer>();
		//Ordered (linkedlist implementation)
		//LinkedHashMap<Car, Integer> map = new LinkedHashMap<Car, Integer>();
		//Sorted in natural order
		TreeMap<Car, Integer> map = new TreeMap<Car, Integer>();
		
		Car c1 = new Car("black", 4, "HGD34AY");
		Car c2 = new Car("yellow", 2, "HGD3RAY");
		Car c3 = new Car("brown", 8, "RFGD34AY");
		Car c4 = new Car("blue", 12, "HGH34AY");
		Car c5 = new Car("red", 4, "HKL34AY");
		
		map.put(c1, 5);
		map.put(c2, 3);
		map.put(c3, 45); 
		map.put(c4, 43);
		map.put(c5, 77);
		
		//get c4...
		System.out.println(map.get(new Car("blue", 12, "HGH34AY")));
		//unknown key
		System.out.println(map.get(new Car("blue", 12, "HGd34AY")));
		//override a car (only regno matters. we repainted the car :) )
		map.put(new Car("red", 12, "HGH34AY"), 100);
		System.out.println(map.get(c4));
		printMap(map);
		
	}

}
