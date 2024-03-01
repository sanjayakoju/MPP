package labs.prob4.behaviour;

public interface QuackBehaviour {

    default public void quack(){
        System.out.println("Default Quack");
    }
}
