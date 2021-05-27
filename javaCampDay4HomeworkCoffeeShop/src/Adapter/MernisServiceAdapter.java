package Adapter;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		boolean proxyResult = false;

		try {
			proxyResult = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.nationalityId),
					customer.firstName.toUpperCase(),
					customer.lastName.toUpperCase(),
					customer.dateOfBirth.getYear()
					);
		} catch (Exception e) {
			System.out.println("Not a valid person");
		}

		return proxyResult;
	}

}
