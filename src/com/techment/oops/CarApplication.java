package com.techment.oops;
class Car{
	int speed;                 //global variable
	String Colour;
	int model;
	Car(){
		System.out.println("default constructor called");
	}
	Car(int model,String color){ //local variable
		System.out.println("parameteried constructor called");
		model=model;
		color=model;
//		this.model=model;
//		this.color=model;
	}
	public String carState(int speed) {
		if(speed>=50)
			return "car is moving";
		else if (speed>0 && speed<50)
			return "Car is slow";
		else
			return "car is stopped";		
	}
	public void displayCarDetail() {
		System.out.println("model : "+ model);
		System.out.println("color : "+ color);
	}
}
public class CarApplication {
	
	public static void main(String[] args) {
		Car audi = new Car();
		Car bmw  = new Car(2020,"Blue");
		
		
		

	}

}
