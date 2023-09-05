
public class ValoresBean<T extends Number> {

	T valorA;
	T valorB;
	T valorC;

	public ValoresBean(T a, T b, T c) {
		this.valorA = a;
		this.valorB = b;
		this.valorC = c;
	}

	public T procesarValores(InterfaceFuncionalEjemplo<T> ifun) {
		return ifun.process(this.valorA, this.valorB, this.valorC);
	}
}