package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		//Product product1 = new Product(1,"Lenovo",1000,"16 gb ram",10);

		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Samsung");
		product2.setUnitPrice(16000);
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		System.out.println("--------------------");
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Icecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		/*Product product3 = new Product();
		product2.setId(3);
		product2.setName("Predator");
		product2.setUnitPrice(15000);
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahce";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		*/
	}

}
