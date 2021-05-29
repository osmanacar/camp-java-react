package manager;

import model.Campaign;
import service.CampaignService;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Yuzde " + campaign.getCampaignDiscount() + " indirimli " + campaign.getCampaignName()
				+ " kampanyasi " + campaign.getCampaignTime() + " gun sureyle eklenmistir");

	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasi silinmistir");

	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyanin indirim orani " + campaign.getCampaignDiscount()
				+ " olmustur");

	}

}
