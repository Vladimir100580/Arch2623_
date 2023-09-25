import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.*;

public class App {
    public static void main(String[] args) throws Exception {
        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GemGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new GlassGenerator());
        generatorList.add(new GasGenerator());
        generatorList.add(new OilGenerator());
        generatorList.add(new SteelGenerator());
        generatorList.add(new TreeGenerator());

        int[] relation = {1, 3, 10, 10, 10, 10, 10, 10}; // Отношение задаем здесь. Протестировал с различными включая краевые, например: {1, 7} и {7,1}
        int sum = Arrays.stream(relation).sum();

        for (int i = 0; i < 200; i++) {
            int rn = rnd.nextInt(sum); // в нашем примере sum = 64
            int sn = 0;
            int index = 0;
            for (int k: relation) {   // пробегаемся по массиву, и, если выбранное число больше текущей накопленной частоты sn, увеличиваем индекс на 1
                sn += k;              // вот где помогли Теорвер и матстат.)
                if (rn >= sn) {
                    index++;
                }
            }
            generatorList.get(index).openReward();
        }
    }
}
