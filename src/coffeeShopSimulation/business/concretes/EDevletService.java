package coffeeShopSimulation.business.concretes;

import coffeeShopSimulation.entities.concretes.Customer;

public class EDevletService {
	public void checkValidity(Customer customer) {
		System.out.println(customer.getCustomerName() + " adlý müþterinin e-devlet üzerinden kontrolü yapýldý.");
	}
}
