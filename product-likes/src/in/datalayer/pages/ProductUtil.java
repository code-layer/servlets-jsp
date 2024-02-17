package in.datalayer.pages;

import java.util.ArrayList;
import java.util.List;

import wm.products.model.Product;

public class ProductUtil {
	public static List<Product> productData = new ArrayList<>();

	static {
		Product p1 = new Product("P101", "Dell Desktop E373", 45678.00);
		Product p2 = new Product("P102", "Logitech Mouse", 245.00);
		Product p3 = new Product("P103", "HP Ink Jet Printer", 5600.00);
		productData.add(p1);
		productData.add(p2);
		productData.add(p3);
	}

}
