package CoffeeShop.adapters;

import CoffeeShop.entities.concretes.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer);

}
