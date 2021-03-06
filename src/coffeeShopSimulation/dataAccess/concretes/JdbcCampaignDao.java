package coffeeShopSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import coffeeShopSimulation.dataAccess.abstracts.ICampaignDao;
import coffeeShopSimulation.entities.concretes.Campaign;

public class JdbcCampaignDao implements ICampaignDao{

	@Override
	public void add(Campaign item) {
		System.out.println("Kampanya Jdbc kullanılarak veritabanına eklendi.");
		
	}

	@Override
	public void update(Campaign item) {
		System.out.println("Kampanya Jdbc kullanılarak veritabanında güncellendi.");
		
	}

	@Override
	public void delete(Campaign item) {
		System.out.println("Kampanya Jdbc kullanılarak veritabanından silindi.");
		
	}

	@Override
	public List<Campaign> getAll() {
		List<Campaign> campaigns = new ArrayList<Campaign>();
		return campaigns;
	}

}
