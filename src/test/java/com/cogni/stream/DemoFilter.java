package com.cogni.stream;

import java.util.ArrayList;
import java.util.List;

class Product
{
	int prdId;
	String prdName;
	double prdPrice;
	
	public Product(int Id,String Name,double price)
	{
		this.prdId = Id;
		this.prdName =Name;
		this.prdPrice = price;
	}
}


public class DemoFilter {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(100,"Laptop",25000.50));
		productList.add(new Product(101,"iPhone",15000.750));
		productList.add(new Product(102,"Server",55000.50));
		productList.add(new Product(103,"MobilePhone",18000.50));
		productList.add(new Product(104,"WorkStation",35000.50));
		productList.forEach(prod -> System.out.println(prod.prdName));
		productList.forEach(prod -> System.out.println(prod.prdId));
		productList.forEach(prod -> System.out.println(prod.prdPrice));
		productList.stream().filter(prd->prd.prdPrice>35000).forEach(prd->System.out.println(prd.prdName));
		
	}

}
