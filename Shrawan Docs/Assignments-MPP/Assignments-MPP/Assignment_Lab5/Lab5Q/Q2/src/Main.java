import duckapp.*;

public class Main {

    /**
     *
     * The Duck object or subtype of Duck can be MallardDuck, RedheadDuck, RubberDock or DecoyDuck.
     * And Each of them hold their own concrete instance of flying and quacking behaviour.
     * This instantiation is done in their own constructor (For more flexibility: can also be passed from the caller)
     *
     *
     * So, the duck class will just delegate to its specific flying and quacking behaviour,
     * in-terms of the concrete reference hold by the provided duck object.
     *
     * Advantage:
     * This provides a flexibility,
     * - to define their own fly() and quack() behavior for any concrete implementation of "Duck" type.
     * OR
     * - caller can just provide the concrete reference of flying and quacking implementation and let Duck superclass handle the delegation
     *
     */

    public static void main(String[] args) {
        Duck[] ducks = {new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
        for(Duck d: ducks) {
            System.out.println(d.getClass().getSimpleName() + ":");
            d.display();
            d.fly();
            d.quack();
            d.swim();
        }
    }
}
