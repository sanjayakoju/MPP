package assignment.lab5.prob2.behavior;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("cannot quack");
    }
}
