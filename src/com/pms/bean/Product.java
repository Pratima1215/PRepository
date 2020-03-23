/**
 * 
 */
package com.sms.bean;

/**
 * @author u27966
 *
 */
public class Product {
	int prodId;
	String prodName;
	int qty; 
	float price;

	/**
	 * 
	 */
	public Product(int prodId,String prodName,int qty,float price) {
		// TODO Auto-generated constructor stub
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.qty = qty;
		this.price = price;
		
	} //end of parameterized constructor
	
	public Product() {
		super();
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
