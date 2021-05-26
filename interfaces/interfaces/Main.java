package interfaces;

public class Main {

	public static void main(String[] args) {
		/*
		 * CustomerManager customerManager = new CustomerManager(new EmailLogger());
		 * 
		 * Customer customer = new Customer(1,"Osman","Acar");
		 * 
		 * customerManager.add(customer);
		 */
		
		
		Logger[] loggers = { new SmsLogger(), new DatabaseLogger(), new FileLogger(), new EmailLogger() };

		CustomerManager customerManager = new CustomerManager(loggers);

		Customer customer = new Customer(1, "Osman", "Acar");

		customerManager.add(customer);
		
	}

}
