package coffeeShopSimulation.business.abstracts;

import java.util.List;

import coffeeShopSimulation.entities.concretes.Customer;

public interface ICustomerService {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	List<Customer> getAll();
}
