import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();

        List<ItemGenerator> generators = new ArrayList<>();
        generators.add(new GemGenerator());
        generators.add(new GoldGenerator());
        generators.add(new NoneGenerator());
        generators.add(new RuneGenerator());
        generators.add(new ArmorGenerator());
        generators.add(new ArmorGenerator());
        generators.add(new ArmorGenerator());
        generators.add(new ArmorGenerator());
        generators.add(new ArmorGenerator());
        generators.add(new ArmorGenerator());

        for (int i = 0; i < 10; i++) {
            int index = Math.abs(random.nextInt(10));
            ItemGenerator itemGenerator = generators.get(index);
            itemGenerator.openReward();
        }
    }


}