package manager;

import model.Gamer;
import service.GamerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		boolean proxyResult = false;

		try {
			proxyResult = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getName().toUpperCase(), gamer.getSurname().toUpperCase(), gamer.getDateOfBirth().getYear());
		} catch (Exception e) {
			System.out.println("Boyle bir kisi yok");
		}

		return proxyResult;
	}

}
