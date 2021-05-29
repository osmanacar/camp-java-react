package manager;

import model.Game;
import service.GameService;

public class GameManager implements GameService {

	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName() + " adli oyun " + game.getGamePrice() + " lira fiyatla listeye eklendi");

	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() + " adli oyun silindi!");

	}

}
