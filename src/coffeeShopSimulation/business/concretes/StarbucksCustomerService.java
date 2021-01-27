package coffeeShopSimulation.business.concretes;

import coffeeShopSimulation.dataAccess.abstracts.ICustomerDao;
import coffeeShopSimulation.entities.concretes.Customer;

public class StarbucksCustomerService extends CustomerService{

	EDevletService eDevletService;
	ICustomerDao starbucksCustomerDao;
	
	public StarbucksCustomerService(ICustomerDao customerDao, EDevletService eDevletService) {
		super(customerDao);
		this.starbucksCustomerDao = customerDao;
		this.eDevletService = eDevletService;
	}
	
	@Override
	public void add(Customer customer) {
		
		eDevletService.checkValidity(customer);
		customerDao.add(customer);
		
	}
}

