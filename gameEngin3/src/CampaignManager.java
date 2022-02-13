public class CampaignManager implements CampaignService{
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println(campaign.getName() + " kampanyası eklenmiştir.");
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("id'si " + campaign.getId() + " olan Kampanya silinmiştir");
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("Kampanya güncellenmiştir " + campaign.getName());
    }
}
