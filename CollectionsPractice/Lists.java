package CollectionsPractice;
import java.util.*;

import model.*;

public class Lists {
	public static void printList(List<Car> cars){
		for( Car car : cars ){
			System.out.println(car);
		}
	}
	
	public static void main(String[] args) {
		
	//Not fast to insert in the beginning
	List<Car> cars = new ArrayList<Car>();
	//Fast to insert everywhere
	//List<Car> cars = new LinkedList<Car>();
	
	Car c1 = new Car("black", 4, "HGD34AY");
	Car c2 = new Car("yellow", 2, "HGD3RAY");
	Car c3 = new Car("brown", 8, "RFGD34AY");
	Car c4 = new Car("blue", 12, "HGH34AY");
	Car c5 = new Car("red", 4, "HKL34AY");
	
	cars.add(c1);
	cars.add(c2);
	cars.add(c3);
	cars.add(c4);
	cars.add(c5);
	
	System.out.println("Unordered:");
	printList(cars);

	Collections.sort(cars, new noOfWheelsComparator());
	
	System.out.println("Ordered");
	printList(cars);	
	}
}
