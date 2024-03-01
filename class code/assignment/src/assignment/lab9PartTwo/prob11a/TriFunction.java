package assignment.lab9PartTwo.prob11a;


@FunctionalInterface
public interface TriFunction<S,T,U,R> {
	R apply(S s, T t, U u);
}
