package coffeeShopSimulation.entities.concretes;

import coffeeShopSimulation.entities.abstracts.IEntity;

public class CoffeeCompany implements IEntity{
	private int companyId;
	private String companyName;

	public CoffeeCompany(int companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}

