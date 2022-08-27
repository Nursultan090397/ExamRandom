public class Dog extends Animal{

    public Dog(int id, String name, int age, int wight, boolean domesticAnimal) {
        super(id, name, age, wight, domesticAnimal);
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void eats() {
        System.out.println("Dog eat meat");
    }

    @Override
    public void heLive() {
        System.out.println("Jerde jashait");
    }
}