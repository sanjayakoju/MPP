package behaviour;

public class CannotFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
