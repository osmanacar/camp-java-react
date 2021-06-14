package layeredDemo.business.abstracts;

import java.util.List;

import layeredDemo.entities.concretes.Product;

public interface ProductService {
	
	void add(Product product);

	List<Product> getAll();
}
