package manager;

import model.Gamer;
import service.GamerCheckService;

public class UserManager extends GamerManager {

	private GamerCheckService gamerCheckService;

	public UserManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void addGamer(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			super.addGamer(gamer);
		} else {
			System.out.println("Boyle bir vatandas yok");
		}
	}

	@Override
	public void updateGamer(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			super.updateGamer(gamer);
		} else {
			System.out.println("Boyle bir vatandas yok");
		}
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			super.deleteGamer(gamer);
		} else {
			System.out.println("Boyle bir vatandas yok");
		}
	}

}
