package Concrete;

import Abstract.BaseServiceManager;
import Abstract.OrderService;
import Entities.Gamer;
import Entities.Game;
import Entities.Campaign;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void order(Order order, Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName() + ", Good Choice!! You ordered " + game.getGameName() + " with the " + campaign.getCampaignName() +". Your order code is " + order.getOrderId() + "." );
		
	}

	@Override
	public void add(Order order) {
		System.out.println("Your order with code " + order.getOrderId() + " added.");
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Your order with code " + order.getOrderId() + " deleted.");
		
	}

	@Override
	public void update(Order order) {
		System.out.println("Your order with code " + order.getOrderId() + " updated.");
		
	}

	

}
