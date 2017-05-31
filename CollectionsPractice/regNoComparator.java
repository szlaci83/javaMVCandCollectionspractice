package CollectionsPractice;
import java.util.Comparator;
import model.Car;


public class regNoComparator implements Comparator<Car>{
	@Override
	public int compare(Car o1, Car o2) {
		String first = o1.getRegistrationNumber();
		String second = o2.getRegistrationNumber();
	    return first.compareTo(second);
	}
}
