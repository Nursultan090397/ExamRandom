public class Bird extends Animal implements CanDo{
    public Bird(int id, String name, int age, int wight, boolean domesticAnimal) {
        super(id, name, age, wight, domesticAnimal);
    }

    @Override
    public void run() {
        System.out.println("Bird is running");
    }

    @Override
    public void eats() {
        System.out.println("Bird eat corn");
    }

    @Override
    public void heLive() {
        System.out.println("Uyada jashait");
    }

    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}
