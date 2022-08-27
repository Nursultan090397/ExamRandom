public class Person {
    private int id;
    private String name;
    private int age;
    private Animal[] animals;
    private Technique[] techniques;

    public Person(int id, String name, int age, Animal[] animals, Technique[] techniques) {
        this.id = id;
        if (name.equals("Asan") || name.equals("Uson") || name.equals("Adyl"))
            this.name = name;
        else
            this.name = "Error name";
        this.age = age;
        this.animals = animals;
        this.techniques = techniques;
    }

    public void getAnimal(){
        for (Animal i:animals) {
            System.out.println(i);
        }
    }

    public void getTechnik(){
        for (Technique i:techniques) {
            System.out.println(i);
        }
    }
}
