package coffeeShopSimulation.business.concretes;

import java.util.List;

import coffeeShopSimulation.business.abstracts.ICustomerService;
import coffeeShopSimulation.dataAccess.abstracts.ICustomerDao;
import coffeeShopSimulation.entities.concretes.Customer;


public class CustomerService implements ICustomerService{
	ICustomerDao customerDao;

	public CustomerService(ICustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@Override
	public void add(Customer customer) {
		customerDao.add(customer);
		
	}

	@Override
	public void update(Customer customer) {
		customerDao.update(customer);
	}

	@Override
	public void delete(Customer customer) {
		customerDao.delete(customer);
	}

	@Override
	public List<Customer> getAll() {
		return customerDao.getAll();
	}
	

}
