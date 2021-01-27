package coffeeShopSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import coffeeShopSimulation.dataAccess.abstracts.ICustomerDao;
import coffeeShopSimulation.entities.concretes.Customer;


public class JdbcNeroCustomerDao implements ICustomerDao{
	
	List<Customer> neroCustomers = new ArrayList<Customer>();
	
	@Override
	public void add(Customer item) {
		System.out.println("Nero müþterisi Jdbc ile veri tabanýna eklendi.");	
		neroCustomers.add(item);
	}

	@Override
	public void update(Customer item) {
		System.out.println("Nero müþterisi Jdbc ile veri tabanýna eklendi.");		
	}

	@Override
	public void delete(Customer item) {
		System.out.println("Nero müþterisi Jdbc ile veri tabanýna eklendi.");		
	}

	@Override
	public List<Customer> getAll() {
		/*Customer customer1 = new Customer(1, "zeynep", "alkan", 1999);
		Customer customer2 = new Customer(2, "kamala", "harris", 1964);
		
		List<Customer> neroCustomers = new ArrayList<Customer>();
		neroCustomers.add(customer1);
		neroCustomers.add(customer2);*/
		
		return neroCustomers;
	}

}
