package coffeeShopSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import coffeeShopSimulation.dataAccess.abstracts.ICustomerDao;
import coffeeShopSimulation.entities.concretes.Customer;


public class JdbcStarbucksCustomerDao implements ICustomerDao{

	List<Customer> starbucksCustomers = new ArrayList<Customer>();
	@Override
	public void add(Customer item) {
		System.out.println("Starbucks müþterisi Jdbc ile veri tabanýna eklendi.");
		starbucksCustomers.add(item);
	}

	@Override
	public void update(Customer item) {
		System.out.println("Starbucks müþterisi Jdbc ile veri tabanýnda güncellendi.");
	}

	@Override
	public void delete(Customer item) {
		System.out.println("Starbucks müþterisi Jdbc ile veri tabanýndan silindi.");
	}
	
	@Override
	public List<Customer> getAll() {
		/*Customer customer1 = new Customer(1, "beyda", "boran", 1999);
		Customer customer2 = new Customer(2, "joe", "biden", 1997);
		
		List<Customer> starbucksCustomers = new ArrayList<Customer>();
		starbucksCustomers.add(customer1);
		starbucksCustomers.add(customer2);*/
		
		return starbucksCustomers;
	}
	
	public void checkValidation(Customer item) {
		System.out.println("Müþteri bilgileri jdbc ile e-devlet üzerinden doðrulandý.");
	}

}
