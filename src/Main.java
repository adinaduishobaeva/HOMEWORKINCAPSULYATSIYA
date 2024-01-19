public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.setName("ЩУКА ");
        System.out.println(fish.getName());
        fish.setColor("белый");
        System.out.println(fish.getColor());
        fish.setAge(2);
        System.out.println(fish.getAge());
        System.out.println("---------------------------------");

        Dog dog = new Dog();
        dog.setName("Барс");
        System.out.println(dog.getName());
        dog.setBreed("Овчарка");
        System.out.println(dog.getBreed());
        dog.setAge(3);
        System.out.println(dog.getAge());
        System.out.println("-------------------------------------");

        Cat cat = new Cat();
        cat.setName("Юки");
        System.out.println(cat.getName());
        cat.setBreed("Мейн кун ");
        System.out.println(cat.getBreed());
        cat.setAge(2);
        System.out.println(cat.getAge());
        System.out.println("------------------------------------------");

        Parrot parrot = new Parrot();
        parrot.setName("Оскар");
        System.out.println(parrot.getName());
        parrot.setBreed("Монах");
        System.out.println(parrot.getBreed());
        parrot.setColor("black");
        System.out.println(parrot.getColor());
        parrot.setAge(1);
        System.out.println(parrot.getAge());

    }
}