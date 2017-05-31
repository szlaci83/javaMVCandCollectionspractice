package CollectionsPractice;

import java.util.Comparator;

import model.Car;

public class noOfWheelsComparator implements Comparator<Car>{

	@Override
	public int compare(Car car0, Car car1) {
		int first = car0.getNumberOfWheels();
		int second = car1.getNumberOfWheels();
		if (first > second){
		    return 1;
		}
		else if (second > first){
		   return -1;
		}
	       return 0;
	}
}