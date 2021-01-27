package coffeeShopSimulation.entities.concretes;

import coffeeShopSimulation.entities.abstracts.IEntity;

public class Campaign implements IEntity{
	private int campaignId;
	private String campaignName;
	private String campaignContent;
	
	public Campaign(int campaignId, String campaignName, String campaignContent) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignContent = campaignContent;
	}

	public int getCampaignId() {
		return campaignId;
	}
	
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	
	public String getCampaignName() {
		return campaignName;
	}
	
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignContent() {
		return campaignContent;
	}

	public void setCampaignContent(String campaignContent) {
		this.campaignContent = campaignContent;
	}
}

