package Concrete;
import Abstract.UserCheckService;
import Entities.Entity;
import Entities.Gamer;

public class GamerCheckManager implements UserCheckService<Gamer> {

	@Override
	public boolean CheckIfRealPerson(Gamer entity) {
		return true;
	}

	

}
