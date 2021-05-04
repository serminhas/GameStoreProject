package Abstract;

import Entities.Entity;

public interface BaseServiceManager<Entity> {
	public void add(Entity entity);
	public void update(Entity entity);
	public void delete(Entity entity);
}
