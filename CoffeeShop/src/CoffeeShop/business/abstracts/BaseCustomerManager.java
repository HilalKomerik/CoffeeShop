package CoffeeShop.business.abstracts;

import CoffeeShop.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CostomerService{
	@Override
	public void Save(Customer customer) {
		
		System.out.println(customer.getFirstName()+" "+customer.getLastName() + " veri tablosuna eklendi.");
		
	}
}
