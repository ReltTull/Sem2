import java.util.Random;

public class ArmorReward implements GameItem{

    Random random = new Random();
    @Override
    public void open()
    { // реализация интерфейса GameItem под класс. В данном случае добавлена система псевдослучайных уровней Random
        int lvl = random.nextInt(1, 10);
        System.out.println("You got the armor of " + lvl + " level");
    }
}
