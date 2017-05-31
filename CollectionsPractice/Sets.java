package CollectionsPractice;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;


import model.Car;

public class Sets {
	static void printSet(Set<Car> set){
		for (Car item : set){
			System.out.println(item);
		}
	}
	
 public static void main(String[] args) {
	 
	//unordered
	//Set<Car> cars = new HashSet<Car>();
	//keeps ordered
	//Set<Car> cars = new LinkedHashSet<Car>();
	//oredered by compareTo method...
	 Set<Car> cars = new TreeSet<Car>();
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
	
	printSet(cars);	
	
	//uses compareto method of Car if TreeSet implementation
	System.out.println(cars.contains(new Car("brown", 8, "RFGD34AY")));
	System.out.println(cars.contains(new Car("brown", 3, "RFGD34AY")));
	
}
}
