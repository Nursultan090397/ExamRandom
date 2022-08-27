public class WhiteSwan extends Animal implements CanDo{
    public WhiteSwan(int id, String name, int age, int wight, boolean domesticAnimal) {
        super(id, name, age, wight, domesticAnimal);
    }

    @Override
    public void run() {
        System.out.println("WhiteSwan is running");
    }

    @Override
    public void eats() {
        System.out.println("WhiteSwan eat fish");
    }

    @Override
    public void heLive() {
        System.out.println("WhiteSwan live at lake");
    }

    @Override
    public void fly() {
        System.out.println("WhiteSwam can fly");
    }
}
