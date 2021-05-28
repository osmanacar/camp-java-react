import java.time.LocalDate;

import Abstract.CustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// CustomerManager customerManager = new NeroCustomerManager();
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Pre", "Dart", LocalDate.of(1903, 1, 19), "19031903190"));
	}

}
