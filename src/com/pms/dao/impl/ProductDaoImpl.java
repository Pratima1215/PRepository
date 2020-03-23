/**
 * 
 */
package com.sms.dao.impl;

import java.util.Scanner;
import com.sms.bean.Product;

import com.sms.bean.Product;

/**
 * @author u27966
 *
 */
public class ProductDaoImpl {

	/**
	 * 
	 */
	Scanner sc=new Scanner(System.in);
	Product addProducts[]=new Product[2];
	public void addProduct() {
		for(int i=0;i<addProducts.length;i++) {
		System.out.println("Enter Product Id: ");
		int prodId=sc.nextInt();
		System.out.println("Enter Product Name:");
		String prodName=sc.next();
		System.out.println("Enter qty needed");
		int qty=sc.nextInt();
		System.out.println("Enter the Price");
		float price=sc.nextFloat();
		Product pd=new Product(prodId,prodName,qty,price);
		addProducts[i]=pd;
		System.out.println("Product Added");
				} //end of for loop
		
	}
	public Product[] viewAllProduct() {
		return addProducts;
	}

	public Product viewProduct(int prodId) {
		for(Product pl: addProducts) {
				
		if(pl.getProdId()== prodId) 
			return pl;
			
		
	}
		return null;
		}
	
}
