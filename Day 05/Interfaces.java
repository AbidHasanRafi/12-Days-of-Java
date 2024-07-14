public class Interfaces {
    public static void main(String[] args) {

        // Interface = a template that can be applied to a class.
        //             similar to inheritance but, but spacifies what a class has/must do.
        //             classes can apply more than one interface, inheritance is limited to one supper.

        Fish fish = new Fish();

        fish.hunt();
        fish.flee();
    }
}

interface Prey {

    void flee();
}

interface Predator {

    void hunt();
}

class Rabbit implements Prey {

    @Override
    public void flee() {
        System.out.println("*The rabbit is fleeing*");

    }
}

class Hawk implements Predator {

    @Override
    public void hunt() {
        System.out.println("*The hawk is hunting*");

    }
}

class Fish implements Prey, Predator {

    @Override
    public void hunt() {
        System.out.println("*The fish is hunting*");

    }

    @Override
    public void flee() {
        System.out.println("*The fish is fleeing*");

    }
}