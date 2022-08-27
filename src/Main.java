import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog(1, "Tuzik", 2, 60, true);
        Dog dog2 = new Dog(2, "Rex", 4, 40, true);

        Cat cat1 = new Cat(1, "Margo", 2, 10, true);
        Cat cat2 = new Cat(2, "Moyau", 4, 6, true);

        Eagle eagle1 = new Eagle(3, "Eagle1", 2, 4, false);
        Eagle eagle2 = new Eagle(4, "Eagle2", 3, 5, false);
        Eagle eagle3 = new Eagle(5, "Eagle3", 4, 6, false);
        Eagle eagle4 = new Eagle(6, "Eagle4", 5, 7, false);
        Eagle eagle5 = new Eagle(7, "Eagle5", 6, 8, false);
        Eagle eagle6 = new Eagle(8, "Eagle6", 7, 9, false);

        WhiteSwan whiteSwan1 = new WhiteSwan(8, "WhiteSwan1", 5, 6, false);
        WhiteSwan whiteSwan2 = new WhiteSwan(9, "WhiteSwan2", 4, 5, false);
        WhiteSwan whiteSwan3 = new WhiteSwan(10, "WhiteSwan3", 3, 3, false);
        WhiteSwan whiteSwan4 = new WhiteSwan(11, "WhiteSwan4", 6, 7, false);
        WhiteSwan whiteSwan5 = new WhiteSwan(12, "WhiteSwan5", 7, 8, false);

        Bird bird1 = new Bird(1234, "Bird1", 3, 3, false);
        Bird bird2 = new Bird(4321, "Bird1", 4, 2, false);
        Bird bird3 = new Bird(5678, "Bird1", 5, 4, false);

        Animal[] animals = {dog, dog2, cat1, cat2, dog2, eagle1, eagle2, eagle3, eagle4, eagle5, eagle6, whiteSwan1, whiteSwan2, whiteSwan3, whiteSwan4, whiteSwan5, bird1, bird2, bird3};
        Animal[] animalsOfCanFly = {eagle1, eagle2, eagle3, eagle4, eagle5, eagle6, whiteSwan1, whiteSwan2, whiteSwan3, whiteSwan4, whiteSwan5, bird1, bird2, bird3};
        Animal[] animalsOfCantFly = {dog, dog2, cat1, cat2};

        Animal[] asansAnimal = {cat1, dog, eagle1 ,eagle2, eagle3, eagle4, eagle5, whiteSwan1, whiteSwan2, whiteSwan3, bird1, bird2};
        Animal[] usonAnimal = {cat1, dog, dog2, eagle1 ,eagle2, eagle3, eagle4, whiteSwan1, whiteSwan2, bird1, bird2, bird3};
        Animal[] adylAnimal = {cat1, cat2, dog, eagle1 ,eagle2, eagle3, eagle4, eagle5, eagle6, whiteSwan1, whiteSwan2, whiteSwan3, whiteSwan4, whiteSwan5, bird1, bird2};

        Airplane airplane1 = new Airplane(456, "Tez Djet", "K-77", 2020);
        Airplane airplane2 = new Airplane(654, "Aeroflot", "Boing-1K", 2021);

        Bayraktar bayraktar = new Bayraktar(987, "Nurs", "ONK-97", 2021);

        Tank tank1 = new Tank(9999, "T-34", "Leilek", 2020);
        Tank tank2 = new Tank(8888, "Pantera", "Germany", 2022);
        Tank tank3 = new Tank(7777, "Akkula", "Batken", 2021);

        Helicopter helicopter1 = new Helicopter(899, "N-97", "Model1", 2022);
        Helicopter helicopter2 = new Helicopter(988, "N-98", "Model12", 2021);
        Helicopter helicopter3 = new Helicopter(766, "N-98", "Model123", 2020);
        Helicopter helicopter4 = new Helicopter(677, "H-99", "Model1234", 2019);
        Helicopter helicopter5 = new Helicopter(566, "H-00", "Model12345", 2022);

        Sidan sidan = new Sidan(000, "Lada", "VAZ 21-14", 2020);

        Technique[] techniques = {airplane1, airplane2, bayraktar, tank1, tank2, tank3, helicopter1, helicopter2, helicopter3, helicopter4, helicopter5, sidan};
        Technique[] techniquesNotFlyable = {tank1, tank2, tank3, sidan};
        Technique[] techniquesFlyable = {airplane1, airplane2, bayraktar, helicopter1, helicopter2, helicopter3, helicopter4, helicopter5};



        Technique[] asansTechnika = {airplane1, airplane2, bayraktar};
        Technique[] usonTechnika = {tank1, tank2, tank3, helicopter1, helicopter2, helicopter3, helicopter4, helicopter5};
        Technique[] adylTechnika = {sidan, bayraktar};

        Person asan = new Person(57335, "Asan", 20, asansAnimal, asansTechnika);
        Person uson = new Person(856, "Uson", 43, usonAnimal, usonTechnika);
        Person adyl = new Person(34567, "Adyl", 25, adylAnimal, adylTechnika);


        getRandom(techniquesNotFlyable, techniquesFlyable, animalsOfCanFly, animalsOfCantFly);

    }

    static void getInformation(Person person){
        person.getAnimal();
        person.getTechnik();
    }

    static void getRandom(Technique[] techniquesNotFlyable, Technique[] techniquesFlyable,Animal[] animalsFlyable,Animal[] animalsNotFlyable){
        Random random = new Random();
        int b = random.nextInt(4);
        if (b==0){
            System.out.println("\n--------------Уча ала турган техникалар: ");
            for (int i = 0; i < techniquesFlyable.length; i++) {
                int a = random.nextInt(techniquesFlyable.length);
                System.out.println(techniquesFlyable[a]);
                techniquesFlyable[a].capacity();
                techniquesFlyable[a].oil();
            }
        }else if (b == 1){
            System.out.println("\n--------------Учалбайт турган техникалар: ");
            for (int i = 0; i < techniquesNotFlyable.length; i++) {
                int a = random.nextInt(techniquesNotFlyable.length);
                System.out.println(techniquesNotFlyable[a]);
                techniquesNotFlyable[a].capacity();
                techniquesNotFlyable[a].oil();
            }
        } else if (b == 2){
            System.out.println("\n--------------Уча ала турган жаныбар: ");
            for (int i = 0; i < animalsFlyable.length; i++) {
                int a = random.nextInt(animalsFlyable.length);
                System.out.println(animalsFlyable[a]);
                animalsFlyable[a].eats();
                animalsFlyable[a].heLive();
            }
        } else {
            System.out.println("\n--------------Учалбайт жаныбар: ");
            for (int i = 0; i < animalsNotFlyable.length; i++) {
                int a = random.nextInt(animalsNotFlyable.length);
                System.out.println(animalsNotFlyable[a]);
                animalsNotFlyable[a].eats();
                animalsNotFlyable[a].heLive();
            }
        }
    }
}
ukwbjendcmf