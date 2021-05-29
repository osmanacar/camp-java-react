package model;

public class Campaign {

	private int campaignNumber;
	private String campaignName;
	private int campaignDiscount;
	private int campaignTime;

	public Campaign(int campaignNumber, String campaignName, int campaignDiscount, int campaignTime) {
		super();
		this.campaignNumber = campaignNumber;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
		this.campaignTime = campaignTime;
	}

	public int getCampaignNumber() {
		return campaignNumber;
	}

	public void setCampaignNumber(int campaignNumber) {
		this.campaignNumber = campaignNumber;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(int campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}

	public int getCampaignTime() {
		return campaignTime;
	}

	public void setCampaignTime(int campaignTime) {
		this.campaignTime = campaignTime;
	}

}
