package standard_exam.sampleProblem;

@FunctionalInterface
public interface MyInterface<S, T, U, V, R> {
	R apply(S s, T t, U u, V v);
}
