package coffeeShopSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import coffeeShopSimulation.dataAccess.abstracts.ICompanyDao;
import coffeeShopSimulation.entities.concretes.CoffeeCompany;

public class JdbcCompanyDao implements ICompanyDao {

	@Override
	public void add(CoffeeCompany item) {
		System.out.println( item.getCompanyName() + " adlý þirket Jdbc kullanýlarak veritabanýna eklendi.");
	}

	@Override
	public void update(CoffeeCompany item) {
		System.out.println(item.getCompanyName() + " adlý þirket Jdbc kullanýlarak veritabanýnda güncellendi.");
		
	}

	@Override
	public void delete(CoffeeCompany item) {
		System.out.println(item.getCompanyName() + " adlý þirket Jdbc kullanýlarak veritabanýndan silindi.");
		
	}

	@Override
	public List<CoffeeCompany> getAll() {
		List<CoffeeCompany> coffeeCompanies = new ArrayList<CoffeeCompany>();
		
		CoffeeCompany company1 = new CoffeeCompany(1, "Starbucks");
		CoffeeCompany company2 = new CoffeeCompany(2, "Nero");
		
		coffeeCompanies.add(company1);
		coffeeCompanies.add(company2);
		
		return coffeeCompanies;
	}



}
