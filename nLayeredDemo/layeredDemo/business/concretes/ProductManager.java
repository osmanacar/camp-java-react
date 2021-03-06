package layeredDemo.business.concretes;

import java.util.List;

import layeredDemo.business.abstracts.ProductService;
import layeredDemo.core.LoggerService;
import layeredDemo.dataAccess.abstracts.ProductDao;
import layeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	

	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// is kodlari yazilir

		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride urun kabul edilmiyor");
			return;
		}

		productDao.add(product);
		loggerService.logToSystem("Urun eklendi : " + product.getName());

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
