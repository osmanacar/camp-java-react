import java.time.LocalDate;

import manager.CampaignManager;
import manager.GameBuyManager;
import manager.GameManager;
import manager.GamerManager;
import manager.MernisServiceAdapter;
import manager.UserManager;
import model.Campaign;
import model.Game;
import model.Gamer;

public class Main {

	public static void main(String[] args) {

		Gamer gamer1 = new Gamer(1, "Osman", "Acar", LocalDate.of(1903, 19, 03), "19031903190");

		GamerManager gamerManager1 = new UserManager(new MernisServiceAdapter());

		gamerManager1.addGamer(gamer1);
		gamerManager1.deleteGamer(gamer1);
		gamerManager1.updateGamer(gamer1);

		Campaign campaign1 = new Campaign(15, "Hosgeldin Yaz", 15, 7);
		Campaign campaign2 = new Campaign(15, "Black Friday", 50, 15);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1);
		campaignManager.deleteCampaign(campaign1);
		campaignManager.addCampaign(campaign2);

		Game game1 = new Game(1, "FIFA 2022", 249.90);
		Game game2 = new Game(1, "Pro Evolucation Soccer 2022", 150);
		GameManager gameManager = new GameManager();
		gameManager.addGame(game1);
		gameManager.addGame(game2);

		GameBuyManager gameBuyManager = new GameBuyManager();
		gameBuyManager.buyWithCampaign(gamer1, game1, campaign2);

	}

}
