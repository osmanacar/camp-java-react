package service;

import model.Campaign;
import model.Game;
import model.Gamer;

public interface GameBuyService {
	public void buyWithCampaign(Gamer gamer, Game game, Campaign campaign);

	public void buyWithOutCampaign(Gamer gamer, Game game);
}
