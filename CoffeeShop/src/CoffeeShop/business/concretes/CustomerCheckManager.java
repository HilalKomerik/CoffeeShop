package CoffeeShop.business.concretes;

import CoffeeShop.adapters.CustomerCheckService;
import CoffeeShop.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return false;
	}
	
}
