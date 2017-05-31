package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.*;

public class CarDealController {
	private carDealer theView;
	private Car theCar;
	private Person thePerson;
	
	public CarDealController(carDealer theView, Car theCar, Person thePerson){
		this.theView = theView;
		this.theCar = theCar;
		this.thePerson = thePerson;
		
	    this.theView.buyCarDealerListener(new BuyListener());
	}
	
	class BuyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String personName = "";
			String carReg = "";
			
			try{
				personName = theView.getPersonName();
				carReg = theView.getCarReg();
				
				//find the person and car...
				thePerson.buyCar(theCar);
				theView.setRespond("Car bought");
				System.out.println(theCar);
				
			}
			
			catch(Exception e){
				theView.displayErrorMessage("error");
			}
			
			
			
			
			
		}
		
	}
	
}
