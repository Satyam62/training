package com.techment.day5.oops;
class Car{
	String name;
	int modelno;
	Engine engine;
	public Car(String name, int modelno, Engine engine) {
		super();
		this.name = name;
		this.modelno = modelno;
		this.engine = engine;
	}
	void displayCarInfo()
	{
		System.out.println("name:"+ name);
		System.out.println("modelno:"+ modelno);
		System.out.println("engineId:"+ engine.engineId);
		System.out.println("accountType:"+ engine.engineType);	
	}	
}
class Engine{
	int engineId;
	String engineType;
	public Engine(int engineId, String engineType) {
		super();
		this.engineId = engineId;
		this.engineType = engineType;
	}	
}
public class HasARelaionshipCarEngine {

	public static void main(String[] args) {
		Engine engine=new Engine(501, "4 stock");
		Car car=new Car("oddy", 2021, engine);
		car.displayCarInfo();
	}
}
//
//package com.techment.day5.oops;
//class Car
//{
//	String modelNo;
//	String name;
//	Engine engine; //object reference(has-a relation)
//	public Car(String modelNo, String name, Engine engine) 
//	{
//		super();
//		this.modelNo = modelNo;
//		this.name = name;
//		this.engine = engine;
//	}
//
//	void displayCarInfo()
//	{
//		System.out.println("modelNo :"+ modelNo);
//		System.out.println("name :"+ name);
//		System.out.println("id "+ engine.id);
//		System.out.println("engineType :"+ engine.engineType);
//	}	
//}
//
//class Engine
//{
//	String id;
//	String engineType;
//	public Engine(String id, String engineType) 
//	{
//		super();
//		this.id = id;
//		this.engineType = engineType;
//	}
//}
//		
//
//public class HasARelaionshipCarEngine {
//
//	public static void main(String[] args) 
//	{
//	
//	Engine engine = new Engine("Turbo" , "diesel");
//	Car car = new Car("10" , "Thar", engine);
//	car.displayCarInfo();
//	}
//
//}
//
//
//
//
