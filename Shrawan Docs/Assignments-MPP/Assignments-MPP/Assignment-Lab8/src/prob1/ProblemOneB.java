package prob1;

import java.util.function.Function;
import java.util.function.Supplier;

public class ProblemOneB {

    // 1b. (i)
    Supplier<Double> doubleRanSupplier = Math::random; // method reference
    Supplier<Double> ansDoubleRanSupplier = () -> Math.random(); // lambda expression

    public static void main(String[] args) {

        ProblemOneB problemOneB = new ProblemOneB();

        // (ii)
        System.out.println(problemOneB.doubleRanSupplier.get());
        System.out.println(problemOneB.ansDoubleRanSupplier.get());


        // (iii)
        System.out.println(problemOneB.new InnerRandSupplier().get());


    }

    public class InnerRandSupplier implements Supplier<Double> {
        @Override
        public Double get(){
            return Math.random();
        }
    }
}
