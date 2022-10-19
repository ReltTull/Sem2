public class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createPrize() {
        return new GemReward();
    }
}
