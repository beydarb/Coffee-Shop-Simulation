package coffeeShopSimulation.business.concretes;

import coffeeShopSimulation.dataAccess.abstracts.ICampaignDao;

public class StarbucksCampaignService extends CampaignService{

	ICampaignDao campaignDao;
	
	public StarbucksCampaignService(ICampaignDao campaignDao) {
		super(campaignDao);
		this.campaignDao = campaignDao;
	}
	
}
