package Concrete;
import Entities.Gamer;
import Abstract.BaseServiceManager;
import Abstract.UserCheckService;

public class GamerManager implements BaseServiceManager<Gamer> {
	
	UserCheckService userCheckService;

	public GamerManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if (userCheckService.CheckIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + ", welcome to the club:)");
		}
		else {
			System.out.println(gamer.getFirstName() + ", there seems to be your infos invalid!");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + ", as your request your infos were updated!");
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + ", we will be missing you! Please come back ASAP!");
	}


	


	
	
}
