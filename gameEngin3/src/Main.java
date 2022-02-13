public class Main {

    public static void main(String[] args) {
        MemberCheckManager memberCheckManager=new MemberCheckManager();
        MemberManager manager=new MemberManager(memberCheckManager);
        Member member=new Member(123,"Tahir","Bağlayici", 1996);
        Game game=new Game("Gta5",250);


        /*manager.registerMember(member);
        manager.updateMember(member);
        manager.deleteMember(member);*/

        Campaign campaign=new Campaign(1,"Efsane Cuma",0.20);
        /*CampaignManager campaignManager=new CampaignManager();
        campaignManager.addCampaign(campaign);*/

        GameManager gameManager=new GameManager(campaign);
        gameManager.discountSale(member,game);
        /*gameManager.makeSale(member,game);*/
    }
}
