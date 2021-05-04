package Abstract;

import Entities.Entity;
import Entities.Gamer;

public interface UserCheckService<Entity> {
	boolean CheckIfRealPerson(Entity entity);
}
