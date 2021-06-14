package layeredDemo;

import layeredDemo.business.abstracts.ProductService;
import layeredDemo.business.concretes.ProductManager;
import layeredDemo.core.JLoggerManagerAdapter;
import layeredDemo.dataAccess.concretes.HibernateProductDao;
import layeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// ToDo: Spring IoC ile iyilestirilecek
		ProductService productService = new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Cilek",15,52);
		productService.add(product);

	}

}
