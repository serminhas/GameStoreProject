package Concrete;

import Abstract.BaseServiceManager;
import Entities.Campaign;

public class CampaignManager implements BaseServiceManager<Campaign>{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " added.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " updated.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " deleted.");
		
	}

}
