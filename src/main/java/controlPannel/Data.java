package controlPannel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Data {
    public final Map<FloraAndFauna, Map<FloraAndFauna, Integer>> listOfVictims;

    public Data(){
        this.listOfVictims = new ConcurrentHashMap<>();
        initializeVictimsMap();
    }

    private synchronized void initializeVictimsMap() {
        if (!listOfVictims.isEmpty()) {
            return; // Уже инициализировано
        }

        // Волк
        Map<FloraAndFauna, Integer> wolfVictims = new ConcurrentHashMap();
        wolfVictims.put(FloraAndFauna.HORSE, 10);
        wolfVictims.put(FloraAndFauna.DEER, 15);
        wolfVictims.put(FloraAndFauna.RABBIT, 60);
        wolfVictims.put(FloraAndFauna.MOUSE, 80);
        wolfVictims.put(FloraAndFauna.GOAT, 60);
        wolfVictims.put(FloraAndFauna.SHEEP, 70);
        wolfVictims.put(FloraAndFauna.WILD_BOAR, 15);
        wolfVictims.put(FloraAndFauna.BUFFALO, 10);
        wolfVictims.put(FloraAndFauna.DUCK, 40);
        listOfVictims.put(FloraAndFauna.WOLF, wolfVictims);

        // Удав
        Map<FloraAndFauna, Integer> boaVictims = new ConcurrentHashMap<>();
        boaVictims.put(FloraAndFauna.FOX, 15);
        boaVictims.put(FloraAndFauna.RABBIT, 20);
        boaVictims.put(FloraAndFauna.MOUSE, 40);
        boaVictims.put(FloraAndFauna.DUCK, 10);
        listOfVictims.put(FloraAndFauna.BOA, boaVictims);

        // Лиса
        Map<FloraAndFauna, Integer> foxVictims = new ConcurrentHashMap<>();
        foxVictims.put(FloraAndFauna.RABBIT, 70);
        foxVictims.put(FloraAndFauna.MOUSE, 90);
        foxVictims.put(FloraAndFauna.DUCK, 60);
        foxVictims.put(FloraAndFauna.CATERPILLAR, 40);
        listOfVictims.put(FloraAndFauna.FOX, foxVictims);

        // Медведь
        Map<FloraAndFauna, Integer> bearVictims = new ConcurrentHashMap<>();
        bearVictims.put(FloraAndFauna.BOA, 80);
        bearVictims.put(FloraAndFauna.HORSE, 40);
        bearVictims.put(FloraAndFauna.DEER, 80);
        bearVictims.put(FloraAndFauna.RABBIT, 80);
        bearVictims.put(FloraAndFauna.MOUSE, 90);
        bearVictims.put(FloraAndFauna.GOAT, 70);
        bearVictims.put(FloraAndFauna.SHEEP, 70);
        bearVictims.put(FloraAndFauna.WILD_BOAR, 50);
        bearVictims.put(FloraAndFauna.BUFFALO, 20);
        bearVictims.put(FloraAndFauna.DUCK, 10);
        listOfVictims.put(FloraAndFauna.BEAR, bearVictims);

        // Орел
        Map<FloraAndFauna, Integer> eagleVictims = new ConcurrentHashMap<>();
        eagleVictims.put(FloraAndFauna.FOX, 10);
        eagleVictims.put(FloraAndFauna.RABBIT, 90);
        eagleVictims.put(FloraAndFauna.MOUSE, 90);
        eagleVictims.put(FloraAndFauna.DUCK, 80);
        listOfVictims.put(FloraAndFauna.EAGLE, eagleVictims);

        // Лошадь (травоядное - ест растения)
        Map<FloraAndFauna, Integer> horseVictims = new ConcurrentHashMap<>();
        horseVictims.put(FloraAndFauna.GRASS, 100);
        horseVictims.put(FloraAndFauna.BUSH, 100);
        listOfVictims.put(FloraAndFauna.HORSE, horseVictims);

        // Олень (травоядное - ест растения)
        Map<FloraAndFauna, Integer> deerVictims = new ConcurrentHashMap<>();
        deerVictims.put(FloraAndFauna.GRASS, 100);
        deerVictims.put(FloraAndFauna.BUSH, 100);
        listOfVictims.put(FloraAndFauna.DEER, deerVictims);

        // Кролик (травоядное - ест растения)
        Map<FloraAndFauna, Integer> rabbitVictims = new ConcurrentHashMap<>();
        rabbitVictims.put(FloraAndFauna.GRASS, 100);
        rabbitVictims.put(FloraAndFauna.BUSH, 100);
        listOfVictims.put(FloraAndFauna.RABBIT, rabbitVictims);

        // Мышь
        Map<FloraAndFauna, Integer> mouseVictims = new ConcurrentHashMap<>();
        mouseVictims.put(FloraAndFauna.CATERPILLAR, 90);
        mouseVictims.put(FloraAndFauna.GRASS, 100);
        mouseVictims.put(FloraAndFauna.BUSH, 100);
        listOfVictims.put(FloraAndFauna.MOUSE, mouseVictims);

        // Коза (травоядное - ест растения)
        Map<FloraAndFauna, Integer> goatVictims = new ConcurrentHashMap<>();
        goatVictims.put(FloraAndFauna.GRASS, 100);
        goatVictims.put(FloraAndFauna.BUSH, 100);
        listOfVictims.put(FloraAndFauna.GOAT, goatVictims);

        // Овца (травоядное - ест растения)
        Map<FloraAndFauna, Integer> sheepVictims = new ConcurrentHashMap<>();
        sheepVictims.put(FloraAndFauna.GRASS, 100);
        sheepVictims.put(FloraAndFauna.BUSH, 100);
        listOfVictims.put(FloraAndFauna.SHEEP, sheepVictims);

        // Кабан
        Map<FloraAndFauna, Integer> wildBoarVictims = new ConcurrentHashMap<>();
        wildBoarVictims.put(FloraAndFauna.MOUSE, 50);
        wildBoarVictims.put(FloraAndFauna.CATERPILLAR, 90);
        wildBoarVictims.put(FloraAndFauna.GRASS, 100);
        wildBoarVictims.put(FloraAndFauna.BUSH, 100);
        listOfVictims.put(FloraAndFauna.WILD_BOAR, wildBoarVictims);

        // Буйвол (травоядное - ест растения)
        Map<FloraAndFauna, Integer> buffaloVictims = new ConcurrentHashMap<>();
        buffaloVictims.put(FloraAndFauna.GRASS, 100);
        buffaloVictims.put(FloraAndFauna.BUSH, 100);
        listOfVictims.put(FloraAndFauna.BUFFALO, buffaloVictims);

        // Утка
        Map<FloraAndFauna, Integer> duckVictims = new ConcurrentHashMap<>();
        duckVictims.put(FloraAndFauna.CATERPILLAR, 90);
        duckVictims.put(FloraAndFauna.GRASS, 100);
        duckVictims.put(FloraAndFauna.BUSH, 100);
        listOfVictims.put(FloraAndFauna.DUCK, duckVictims);

        // Гусеница (травоядное - ест растения)
        Map<FloraAndFauna, Integer> caterpillarVictims = new ConcurrentHashMap<>();
        caterpillarVictims.put(FloraAndFauna.GRASS, 100);
        caterpillarVictims.put(FloraAndFauna.BUSH, 100);
        listOfVictims.put(FloraAndFauna.CATERPILLAR, caterpillarVictims);

        // Растения не едят никого (пустые ConcurrentHashMap)
        listOfVictims.put(FloraAndFauna.GRASS, new ConcurrentHashMap<>());
        listOfVictims.put(FloraAndFauna.BUSH, new ConcurrentHashMap<>());
    }


    public enum FloraAndFauna {
        // Хищники
        WOLF(30, 3, 8000, "Wolf"),            // 8 кг = 8000 г
        BOA(30, 1, 3000, "Boa"),              // 3 кг = 3000 г
        FOX(30, 2, 2000, "Fox"),              // 2 кг = 2000 г
        BEAR(5, 2, 80000, "Bear"),            // 80 кг = 80000 г
        EAGLE(20, 3, 1000, "Eagle"),          // 1 кг = 1000 г

        // Травоядные
        HORSE(20, 4, 60000, "Horse"),         // 60 кг = 60000 г
        DEER(20, 4, 50000, "Deer"),           // 50 кг = 50000 г
        RABBIT(150, 2, 450, "Rabbit"),        // 0.45 кг = 450 г
        MOUSE(500, 1, 10, "Mouse"),           // 0.01 кг = 10 г
        GOAT(140, 3, 10000, "Goat"),          // 10 кг = 10000 г
        SHEEP(140, 3, 15000, "Sheep"),        // 15 кг = 15000 г
        WILD_BOAR(50, 2, 50000, "WildBoar"),  // 50 кг = 50000 г
        BUFFALO(10, 3, 100000, "Buffalo"),    // 100 кг = 100000 г
        DUCK(200, 4, 150, "Duck"),            // 0.15 кг = 150 г
        CATERPILLAR(1000, 0, 0, "Caterpillar"), // 0 кг = 0 г

        // Растения
        GRASS(0, 0, 0, "Grass"),
        BUSH(0, 0, 0, "Bush");


        private final int maxCountInOneArea;
        private final int maxSpeedForOneStep;
        private final int gramsOfFoodToSatiety; // Переименовано в граммы
        private final String nameOfAnimal;

        FloraAndFauna(int maxCountInOneArea, int maxSpeedForOneStep, int gramsOfFoodToSatiety, String nameOfAnimal) {
            this.maxCountInOneArea = maxCountInOneArea;
            this.maxSpeedForOneStep = maxSpeedForOneStep;
            this.gramsOfFoodToSatiety = gramsOfFoodToSatiety;
            this.nameOfAnimal = nameOfAnimal;
        }

        public int getMaxCountInOneArea() { return maxCountInOneArea; }
        public int getMaxSpeedForOneStep() { return maxSpeedForOneStep; }
        public int gramsOfFoodToSatiety() { return gramsOfFoodToSatiety; }
        public String nameOfAnimal() { return nameOfAnimal; }

            @Override
        public String toString() {
                return nameOfAnimal + "[maxCount=" + maxCountInOneArea +
                        ", speed=" + maxSpeedForOneStep +
                        ", eat=" + gramsOfFoodToSatiety + "]";
            }
    }

    public enum Messages {

    }

}
