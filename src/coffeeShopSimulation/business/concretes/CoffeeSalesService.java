package coffeeShopSimulation.business.concretes;

import coffeeShopSimulation.business.abstracts.ICampaignService;
import coffeeShopSimulation.business.abstracts.ICoffeeSales;
import coffeeShopSimulation.entities.concretes.CoffeeCompany;
import coffeeShopSimulation.entities.concretes.Customer;

public class CoffeeSalesService implements ICoffeeSales {

	ICampaignService campaignService;
	CoffeeCompany coffeeCompany;
	public CoffeeSalesService(ICampaignService campaignService, CoffeeCompany coffeeCompany) {
		super();
		this.campaignService = campaignService;
		this.coffeeCompany = coffeeCompany;
	}


	@Override
	public void shopping(Customer customer) {
		System.out.println(customer.getCustomerName() + ", " + coffeeCompany.getCompanyName() + " kahve dükkanýndan kahve aldýnýz.");
		campaignService.currentCampaign();
	}

}
