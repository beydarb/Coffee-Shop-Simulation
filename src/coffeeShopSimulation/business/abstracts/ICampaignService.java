package coffeeShopSimulation.business.abstracts;

import java.util.List;

import coffeeShopSimulation.entities.concretes.Campaign;

public interface ICampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	void currentCampaign();
	List<Campaign> getAll();
	
}

