package labs.prob4.behaviour;

public interface FlyBehaviour {

    default public void fly(){
        System.out.println("Default Flying");
    }
}
