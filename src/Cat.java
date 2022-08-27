public class Cat extends Animal{

    public Cat(int id, String name, int age, int wight, boolean domesticAnimal) {
        super(id, name, age, wight, domesticAnimal);
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void eats() {
        System.out.println("Cat eat fish");
    }

    @Override
    public void heLive() {
        System.out.println("Cat live at home");
    }
}
