package CoffeeShop;


import CoffeeShop.adapters.MernisServiceAdapter;
import CoffeeShop.business.abstracts.BaseCustomerManager;
import CoffeeShop.business.concretes.StarbucksCustomerManager;
import CoffeeShop.entities.concretes.Customer;



public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"Enes","��men",2000,"27450392359"));
		customerManager.Save(new Customer(2,"Hilal", "K�merik",2001, "59403524534"));
		
	// Bilgilerinizi �zellikle kimli�inizi girdi�inizde do�ru cevap alacaks�n�z.
}}
