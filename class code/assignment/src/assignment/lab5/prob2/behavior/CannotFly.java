package assignment.lab5.prob2.behavior;



public class CannotFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
