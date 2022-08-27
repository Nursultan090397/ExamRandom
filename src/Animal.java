public abstract class Animal {
    private int id;
    private String name;
    private int age;
    private int wight;
    private boolean domesticAnimal;

    public Animal(int id, String name, int age, int wight, boolean domesticAnimal) {
        this.id = id;
        if (name.length()>2)
            this.name = name;
        else
            this.name = "Error name";

        if (age>0)
            this.age = age;
        else
            System.out.println("Number is negative");

        this.wight = wight;
        this.domesticAnimal = domesticAnimal;
    }

    public abstract void run();
    public abstract void eats();
    public abstract void heLive();

    @Override
    public String toString() {
        return
                "--------------------------" +
                        "\nid = " + id +
                        "\nname = " + name +
                        "\nage = " + age +
                        "\nwight = " + wight +
                        "\ndomesticAnimal=" + domesticAnimal;
    }
}
