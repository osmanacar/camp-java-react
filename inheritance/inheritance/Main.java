package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer osman = new IndividualCustomer();
		osman.customerNumber = "1903";
		
		CorporateCustomer predator = new CorporateCustomer();
		predator.customerNumber = "2016";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		
		CustomerManager customerManager = new CustomerManager();
		/*customerManager.add(predator);
		customerManager.add(osman);
		customerManager.add(abc); */
		
		Customer[] customers = {osman,predator,abc};
		
		customerManager.addMultiple(customers);
	}

}
