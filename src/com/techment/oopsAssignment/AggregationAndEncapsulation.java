package com.techment.oopsAssignment;

class Address{
	
	private String addressLine;
	private String city;
	
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	void getAddressDetails() {
		
		System.out.println("Addresss is:" +addressLine);
		System.out.println("City is:" +city);
	}
	
}
class Customer{
	private String custName;
	ResidencialDetails address;
	public Customer(String custName, ResidencialDetails address) {
		super();
		this.custName = custName;
		this.address = address;
	}
	void getCustomerDetails() {
		System.out.println("Customer : "+custName);
		System.out.println("Address : "+address.doorNo);
		System.out.println("Street Name : "+address.streetName);

	}
	
}
class ResidencialDetails{
	int doorNo;
	String streetName;
	public ResidencialDetails(int doorNo, String streetName) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
	}
	
}

public class AggregationAndEncapsulation {
	
	public static void main(String ags[]) {

		ResidencialDetails residencialDetails = new ResidencialDetails(201," Bhilai");
		Customer customer=new Customer("Satyam Sahu", residencialDetails);
		customer.getCustomerDetails();
		
	}

}