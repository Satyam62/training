package com.techment.day8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product
{
	int id;
	String name;
	int price;
	int quantity;
	public Product(int id, String name, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity+ "]";
	}
	
}

class PriceSort implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.price==o2.price)
			return 0;
		else if(o1.price>o2.price)
			return 1;
		else
			return -1;
		}

}
class Quantity implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
         if(o1.quantity==o2.quantity)
        	 return 0;
         else if(o1.quantity<o2.quantity)
        	 return 1;
         else
        	 return -1;
	}

	
}

public class ProductDemo {

	public static void main(String[] args) {
		
		ArrayList<Product> p = new ArrayList<Product>();
		p.add(new Product(1, "chocolate" , 100 ,2));
		p.add(new Product(3, "brush" , 10 ,1));
		p.add(new Product(2, "mirror" , 1000 ,1));
		
		for(Product pr :p)
		{
			System.out.println(pr);
		}
		System.out.println("============================Sorting by price================");

		Collections.sort(p,new PriceSort());
		for(Product pr :p)
		{
			System.out.println(pr);
		}
		
		System.out.println("============================Sorting by quantity================");

		Collections.sort(p,new Quantity());
		for(Product pr :p)
		{
			System.out.println(pr);
		}
		System.out.println("============================price>500================");

		for(Product pr :p)
		{
			if(pr.price>500)
			System.out.println(pr);
		}



	}

}


//package com.techment.day8;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class Product implements Comparable<Product>
//{
//	int id;
//	String name;
//	float price;
//	int quantity;
//	public Product(int id, String name, float price, int quantity) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.price = price;
//		this.quantity = quantity;
//	}
//	public Product() {
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
//	}
//	public int compareTo(Product o1,Product o2) {
//		
//		return 0;
//	}
//	@Override
//	public int compareTo(Product o) {
//		
//		return 0;
//	}
//	
//	
//}
//
//public class ProductDemo {
//
//	public static void main(String[] args) {
//		ArrayList<Product> products=new ArrayList<Product>();
//		products.add(new Product(2, "Satyam", 100000, 20));
//		products.add(new Product(1, "Akshat", 1000, 2));
//		products.add(new Product(3, "Pragya", 522, 23));
//		products.add(new Product(5, "Divyanshi", 500000, 0));
//		System.out.println("before : ");
//		for(Product prd: products) {
//			System.out.println(prd.id+"  "+prd.name+"  "+prd.price+"  "+prd.quantity);
//		}
//		Collections.sort(products);
//		System.out.println("after : ");
//		for(Product prd: products) {
//			System.out.println(prd.id+"  "+prd.name+"  "+prd.price+"  "+prd.quantity);
//		}
//		System.out.println("============================Sorting by age================");
//
//		Collections.sort(products,new Product());
//		for(Product p :products)
//		{
//			System.out.println(p);
//		}
//
//
//	}
//
//}
