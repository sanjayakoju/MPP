package behaviour;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("cannot quack");
    }
}
