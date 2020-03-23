/**
 * 
 */
package com.sms.client;

import java.util.Scanner;

import com.sms.bean.Product;
import com.sms.dao.impl.ProductDaoImpl;

/**
 * @author u27966
 *
 */
public class ProductClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDaoImpl pdi=new ProductDaoImpl();
		while(true) {
		System.out.println("Product List:Enter you choice");
		System.out.println("----------1) TO Add Product-------");
		System.out.println("----------2) View All Product-----");
		System.out.println("----------3) Find a Product-----");
		System.out.println("----------4) Update a Product-----");
		System.out.println("----------5) Delete a Product-----");
		System.out.println("----------6) Exit-----------------");
		Scanner sc=new Scanner(System.in);
		int prod=sc.nextInt();
		switch(prod) {
		case 1:
			pdi.addProduct();
			break;
		case 2:
			Product[] pd = pdi.viewAllProduct();
			for(Product pdl: pd) {
				if(pd!=null) {
				System.out.println(pdl.getProdId()+"\t"+pdl.getProdName()+"\t"+pdl.getQty()+"\t"+pdl.getPrice());
				}
				
			}
			break;
			
		case 3:
			System.out.println("Enter Product ID");
			int prodId=sc.nextInt();
			Product pdr=pdi.viewProduct(prodId);
			System.out.println(pdr.getProdId()+"\t"+pdr.getProdName()+"\t"+pdr.getQty()+"\t"+pdr.getPrice());
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			System.out.println("Thanks for using the app");
			System.exit(0);
			break;
			default:
				System.out.println("Choose from 1 to 6 options");
		}
		}
		
	}

}
