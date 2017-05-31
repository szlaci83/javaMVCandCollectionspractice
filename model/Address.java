package model;

public class Address {
   private String houseNumber;
   private String streetName;
   private String city;
   private String postCode;
   
   
public String getHouseNumber() {
	return houseNumber;
}
public void setHouseNumber(String houseNumber) {
	this.houseNumber = houseNumber;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPostCode() {
	return postCode;
}
public void setPostCode(String postCode) {
	this.postCode = postCode;
}
public Address(String houseNumber, String streetName, String city, String postCode) {
	super();
	this.houseNumber = houseNumber;
	this.streetName = streetName;
	this.city = city;
	this.postCode = postCode;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((houseNumber == null) ? 0 : houseNumber.hashCode());
	result = prime * result + ((postCode == null) ? 0 : postCode.hashCode());
	result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
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
	Address other = (Address) obj;
	if (city == null) {
		if (other.city != null)
			return false;
	} else if (!city.equals(other.city))
		return false;
	if (houseNumber == null) {
		if (other.houseNumber != null)
			return false;
	} else if (!houseNumber.equals(other.houseNumber))
		return false;
	if (postCode == null) {
		if (other.postCode != null)
			return false;
	} else if (!postCode.equals(other.postCode))
		return false;
	if (streetName == null) {
		if (other.streetName != null)
			return false;
	} else if (!streetName.equals(other.streetName))
		return false;
	return true;
}

@Override
public String toString() {
	return "Address [houseNumber=" + houseNumber + ", streetName=" + streetName + ", city=" + city + ", postCode="
			+ postCode + "]";
}
   
}