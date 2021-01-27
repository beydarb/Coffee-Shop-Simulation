package coffeeShopSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import coffeeShopSimulation.entities.concretes.Campaign;

public class JdbcStarbucksCampaignDao extends JdbcCampaignDao{
	
	@Override
	public List<Campaign> getAll() {
		List<Campaign> campaigns = new ArrayList<Campaign>();
		Campaign campaign1 = new Campaign(1, "Yýldýz Kampanyasý", "Tebrikler, bu alýþveriþinizle 1 yýldýz kazandýnýz!");
		campaigns.add(campaign1);
		return campaigns;
	}

}
