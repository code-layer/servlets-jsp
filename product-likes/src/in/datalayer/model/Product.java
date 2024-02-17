package in.datalayer.model;

import java.io.Serializable;

public class Product implements Serializable{
	private String id,prodName;
	private double price;

	public Product( ) {

	}

	public Product(String id, String prodName, double price) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}