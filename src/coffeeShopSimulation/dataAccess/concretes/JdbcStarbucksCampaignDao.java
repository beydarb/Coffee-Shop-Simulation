package coffeeShopSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import coffeeShopSimulation.entities.concretes.Campaign;

public class JdbcStarbucksCampaignDao extends JdbcCampaignDao{
	
	@Override
	public List<Campaign> getAll() {
		List<Campaign> campaigns = new ArrayList<Campaign>();
		Campaign campaign1 = new Campaign(1, "Y�ld�z Kampanyas�", "Tebrikler, bu al��veri�inizle 1 y�ld�z kazand�n�z!");
		campaigns.add(campaign1);
		return campaigns;
	}

}
