package coffeeShopSimulation.business.concretes;

import coffeeShopSimulation.entities.concretes.Customer;

public class EDevletService {
	public void checkValidity(Customer customer) {
		System.out.println(customer.getCustomerName() + " adl� m��terinin e-devlet �zerinden kontrol� yap�ld�.");
	}
}
