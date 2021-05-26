package interfaces;

public class CustomerManager {

	// loosely coupled - tightly coupled -- bagimlilik

	
	/*
	 * private Logger logger;
	 * 
	 * public CustomerManager(Logger logger) { this.logger = logger; }
	 * 
	 * public void add(Customer customer) { System.out.println("Musteri eklendi " +
	 * customer.getFirstName()); logger.log(customer.getFirstName());
	 * 
	 * // DatabaseLogger logger = new DatabaseLogger(); //
	 * logger.log(customer.getFirstName() + " veritabanina loglandi"); }
	 * 
	 * 
	 * public void delete(Customer customer) { System.out.println("Musteri silindi "
	 * + customer.getFirstName()); logger.log(customer.getFirstName());
	 * 
	 * // DatabaseLogger logger = new DatabaseLogger(); //
	 * logger.log(customer.getFirstName() + " veritabanina loglandi"); }
	 * 
	 */

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Musteri eklendi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		/*for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}*/

	}

	public void delete(Customer customer) {
		System.out.println("Musteri silindi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		/*for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}*/

	}

}
