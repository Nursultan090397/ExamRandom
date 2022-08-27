public class Eagle extends Animal implements CanDo{
    public Eagle(int id, String name, int age, int wight, boolean domesticAnimal) {
        super(id, name, age, wight, domesticAnimal);
    }

    @Override
    public void run() {
        System.out.println("Eagle is running");
    }

    @Override
    public void eats() {
        System.out.println("Eagle eat meat");
    }

    @Override
    public void heLive() {
        System.out.println("Eagle live at tree");
    }


    @Override
    public void fly() {
        System.out.println("Eagle can fly");
    }
}
