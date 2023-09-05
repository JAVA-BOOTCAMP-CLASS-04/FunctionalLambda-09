@FunctionalInterface
public interface InterfaceFuncionalEjemplo<T extends Number> {

	T process(T a, T b, T c);

	default String methodoPrueba() {
		return "hola";
	}
}