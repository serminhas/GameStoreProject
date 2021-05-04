import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.OrderManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Order;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
		Gamer gamer1=new Gamer(1, "Sermin", "Has", "123456789", 1983 );
		Gamer gamer2=new Gamer(2, "Onur", "Has", "987654321", 1980 );
		gamerManager.add(gamer1);
		
		CampaignManager campaignManager=new CampaignManager();
		Campaign campaign1=new Campaign("%50 Discount", 0.5);
		Campaign campaign2=new Campaign("%30 Discount", 0.3);
		campaignManager.add(campaign1);
		
		GameManager gameManager=new GameManager();
		Game game=new Game(1, "Call of Duty", 100, 100*(1-campaign1.getDiscountRate()));
		gameManager.add(game);
		
		OrderManager orderManager=new OrderManager();
		Order order1=new Order("111", "Choice 1");
		orderManager.order(order1, gamer1, game, campaign1);
	}

}
