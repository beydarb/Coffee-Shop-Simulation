package coffeeShopSimulation.entities.concretes;

import coffeeShopSimulation.entities.abstracts.IEntity;

public class Customer implements IEntity{
	private int id;
	private String customerName;
	private String customerSurname;
	private int dateOfBirth;
	
	public Customer(int id, String customerName, String customerSurname, int dateOfBirth) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerSurname = customerSurname;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}
	
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerSurname() {
		return customerSurname;
	}
	
	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}
	
}
