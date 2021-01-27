package coffeeShopSimulation;

import coffeeShopSimulation.business.concretes.*;
import coffeeShopSimulation.dataAccess.concretes.*;
import coffeeShopSimulation.entities.concretes.*;

public class Main {

	public static void main(String[] args) {
		CoffeeCompany starbucksCompany = new CoffeeCompany(1, "Starbucks");
		CoffeeCompany neroCompany = new CoffeeCompany(2, "Nero");
		
		Customer customer1 = new Customer(1, "Beyda", "Boran", 1999);
		Customer customer2 = new Customer(2, "Ezgi", "Çanakçý", 1987);
		
		CustomerService starbucksCustomerService = new StarbucksCustomerService(new JdbcStarbucksCustomerDao(), new EDevletService());
		CustomerService neroCustomerService = new CustomerService(new JdbcNeroCustomerDao());
		
		starbucksCustomerService.add(customer1);
		neroCustomerService.add(customer2);
	
		
		CampaignService starbucksCampaignService = new StarbucksCampaignService(new JdbcStarbucksCampaignDao());
		CampaignService neroCampaignService = new CampaignService(new JdbcCampaignDao());
		
		CoffeeSalesService starbucksCoffeeSales = new CoffeeSalesService(starbucksCampaignService, starbucksCompany);
		CoffeeSalesService neroCoffeeSales = new CoffeeSalesService(neroCampaignService, neroCompany);

		starbucksCoffeeSales.shopping(starbucksCustomerService.getAll().get(0));
		neroCoffeeSales.shopping(neroCustomerService.getAll().get(0));
	}

}
