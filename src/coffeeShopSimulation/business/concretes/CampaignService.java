package coffeeShopSimulation.business.concretes;

import java.util.List;

import coffeeShopSimulation.business.abstracts.ICampaignService;
import coffeeShopSimulation.dataAccess.abstracts.ICampaignDao;
import coffeeShopSimulation.entities.concretes.Campaign;

public class CampaignService implements ICampaignService {
	ICampaignDao campaignDao;
	
	public CampaignService(ICampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}
	
	@Override
	public void add(Campaign campaign) {
		campaignDao.add(campaign);
	}

	@Override
	public void delete(Campaign campaign) {
		campaignDao.delete(campaign);
	}

	@Override
	public void update(Campaign campaign) {
		campaignDao.update(campaign);
	}

	@Override
	public List<Campaign> getAll() {
		return campaignDao.getAll();
	}

	@Override
	public void currentCampaign() {
		if(campaignDao.getAll().size() >= 1) {
			System.out.println(campaignDao.getAll().get(0).getCampaignContent());
		}
		else {
			return;
		}
		
	}

}

