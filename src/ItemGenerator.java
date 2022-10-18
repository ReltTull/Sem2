public abstract class ItemGenerator {
    public abstract GameItem createPrize ();

    public void openReward()
    {
        GameItem rewardPrize = createPrize();
        rewardPrize.open();
    }



}
