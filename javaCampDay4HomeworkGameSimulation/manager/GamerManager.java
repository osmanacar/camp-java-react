package manager;

import model.Gamer;
import service.GamerService;

public abstract class GamerManager implements GamerService {

	@Override
	public void addGamer(Gamer gamer) {
		System.out.println("Oyuncu sisteme eklendi : " + gamer.getName() + " " + gamer.getSurname());

	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println("Oyuncu guncellendi : " + gamer.getName() + " " + gamer.getSurname());

	}

	@Override
	public void deleteGamer(Gamer gamer) {
		System.out.println("Oyuncu sistemden silindi : " + gamer.getName() + " " + gamer.getSurname());

	}

}
