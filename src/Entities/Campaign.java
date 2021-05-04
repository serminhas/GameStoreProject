package Entities;

public class Campaign implements Entity {
	private String campaignName;
	private double discountRate;
	
	public Campaign() {
		
	}

	public Campaign(String campaignName, double discountRate) {
		super();
		this.campaignName = campaignName;
		this.discountRate = discountRate;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
