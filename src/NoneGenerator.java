public class NoneGenerator extends ItemGenerator {
    @Override
    public GameItem createPrize() {
        return new NoneReward();
    }
}
