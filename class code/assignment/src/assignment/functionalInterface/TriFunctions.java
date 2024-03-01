package assignment.functionalInterface;

@FunctionalInterface
public interface TriFunctions<S,T,U,R> {

	R apply(S s, T t, U u);
}
