package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Order;

public interface OrderService {

	void order(Order order, Gamer gamer, Game game, Campaign campaign);
	void add(Order order);
	void delete(Order order);
	void update(Order order);
}
