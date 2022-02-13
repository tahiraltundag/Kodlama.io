public class GameManager implements GameService{

    private Campaign campaign;

    public GameManager(Campaign campaign){
        this.campaign = campaign;
    }
    @Override
    public void makeSale(Member member, Game game) {
        System.out.println("Fiyatı : " + game.getPrice()
                            + " olan oyuna yüzde " + campaign.getDiscountRate()
                            + " indirim yapılarak satılmıştır " + (game.getPrice()-(game.getPrice()*campaign.getDiscountRate())));
    }

    @Override
    public void discountSale(Member member, Game game) {
        System.out.println(member.getFirstName() +  " tarafından " + game.getGameName() + " oyunu alınmıştır");
    }
}
