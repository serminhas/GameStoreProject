package Adapters;
import Entities.Entity;
import Entities.Gamer;
import java.rmi.RemoteException;
import java.lang.NumberFormatException;
import Abstract.UserCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements UserCheckService<Gamer> {
	@Override
	public boolean CheckIfRealPerson(Gamer gamer){
	KPSPublicSoapProxy client=new KPSPublicSoapProxy();
	try {
		return  client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()) , gamer.getFirstName().toUpperCase(),
				gamer.getLastName().toUpperCase(), gamer.getDateOfBirth());
	} catch (NumberFormatException e) {
		e.printStackTrace();
	} catch (RemoteException e) {
		e.printStackTrace();
	}
	return true;
}
}
