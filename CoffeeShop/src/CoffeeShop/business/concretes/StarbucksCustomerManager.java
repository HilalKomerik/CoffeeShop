package CoffeeShop.business.concretes;

import CoffeeShop.adapters.CustomerCheckService;
import CoffeeShop.business.abstracts.BaseCustomerManager;


public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
		
	}
	
	@Override
	public void Save(CoffeeShop.entities.concretes.Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer))
		{
			super.Save(customer);
		}
		else 
		{
			System.out.println(customer.getFirstName()+" veri tabanýna kaydedilemedi.");
		}
	}


}
