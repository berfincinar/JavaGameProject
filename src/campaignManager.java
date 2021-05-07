

public class campaignManager {
	public void saveCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaingName()+" is saved");
	}
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaingName()+" is deleted");
	}
	public void updatedCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaingName()+" is updated");
	}
}
