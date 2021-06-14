package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.ABCProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// ToDo: Spring IoC ile iyilestirilecek
		ProductService productService = new ProductManager(new ABCProductDao(),new JLoggerManagerAdapter());

		Product product = new Product(1, 2, "Portakal", 12, 50);
		productService.add(product);

	}

}
