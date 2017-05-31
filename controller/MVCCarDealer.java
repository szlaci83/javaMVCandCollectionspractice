package controller;
import model.*;
import view.*;

public class MVCCarDealer {
  public static void main(String[] args) {
	  carDealer theView = new carDealer();
	  Person owner = new Person("Joe", "Smith", new Address("22", "London Road", "Luton", "LU2 6UI"));
	  Car car = new Car("black", 4, "GHY87UJ");
	  CarDealController controller = new CarDealController(theView, car, owner);
	  theView.setVisible(true);
}
}
