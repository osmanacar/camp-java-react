package manager;

import model.Campaign;
import model.Game;
import model.Gamer;
import service.GameBuyService;

public class GameBuyManager implements GameBuyService {

	@Override
	public void buyWithCampaign(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getName() + " " + gamer.getSurname() + " " + game.getGameName() + " oyununu "
				+ campaign.getCampaignDiscount() + " indirimle " + (game.getGamePrice()
						- ((game.getGamePrice() * campaign.getCampaignDiscount()) / 100) + " liraya satin aldi"));

	}

	@Override
	public void buyWithOutCampaign(Gamer gamer, Game game) {
		System.out.println(gamer.getName() + " " + gamer.getSurname() + game.getGameName() + " oyununu "
				+ game.getGamePrice() + " liraya satin aldi");

	}

}
