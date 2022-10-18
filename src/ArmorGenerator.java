public class ArmorGenerator extends ItemGenerator {
    @Override
    public GameItem createPrize() {
        return new ArmorReward();
    }
}
