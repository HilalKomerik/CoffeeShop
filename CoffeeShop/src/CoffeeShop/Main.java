package CoffeeShop;


import CoffeeShop.adapters.MernisServiceAdapter;
import CoffeeShop.business.abstracts.BaseCustomerManager;
import CoffeeShop.business.concretes.StarbucksCustomerManager;
import CoffeeShop.entities.concretes.Customer;



public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"Enes","Ýçmen",2000,"27450392359"));
		customerManager.Save(new Customer(2,"Hilal", "Kömerik",2001, "59403524534"));
		
	// Bilgilerinizi özellikle kimliðinizi girdiðinizde doðru cevap alacaksýnýz.
}}
