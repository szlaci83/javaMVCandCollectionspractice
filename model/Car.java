package model;

import CollectionsPractice.noOfWheelsComparator;

public class Car implements Comparable{
	
	private String color;
	private int numberOfWheels;
	private String registrationNumber;
	private int speed;
	private Person owner;
	
	
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void accelerate(){
		this.speed++;
	}
	
	public void accelerate(int value){
		this.speed += value;
	}
	public Car(String color, int numberOfWheels, String registrationNumber) {
		super();
		this.color = color;
		this.numberOfWheels = numberOfWheels;
		this.registrationNumber = registrationNumber;
		this.speed = 0;
		this.owner = null;
	}
	
	//Two Car objects are equal if their reg number is equal.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((registrationNumber == null) ? 0 : registrationNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (registrationNumber == null) {
			if (other.registrationNumber != null)
				return false;
		} else if (!registrationNumber.equals(other.registrationNumber))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", numberOfWheels=" + numberOfWheels + ", registrationNumber="
				+ registrationNumber + ", speed=" + speed + ", owner=" + owner + "]";
	}
	@Override
	public int compareTo(Object o) {
		Car other = (Car) o; 
 	  return new noOfWheelsComparator().compare(this, other); 
	}
	
}