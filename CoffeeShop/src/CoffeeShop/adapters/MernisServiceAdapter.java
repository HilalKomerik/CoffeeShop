package CoffeeShop.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import CoffeeShop.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy mernis = new KPSPublicSoapProxy();
		
		boolean result=true;
		try {
		result=mernis.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(new Locale("tr")), 
				customer.getLastName().toUpperCase(new Locale("tr")), customer.getTimeOfBirth());
		}catch (RemoteException e) {
			
			e.printStackTrace();
		}
			
		return result;
	}
	
	

}
