public class DemoInterfacesFuncionales {

	public static void main(String[] args) {
		/**
		 * Creamos nuestra propia Interfaz Funcional y la probamos
		 */

		InterfaceFuncionalEjemplo<Integer> ifun = new InterfaceFuncionalEjemplo<>() {

            @Override
            public Integer process(Integer a, Integer b, Integer c) {
                return a * b * c;
            }
        };

		InterfaceFuncionalEjemplo<Integer> ifunLambda = (a, b, c) -> a * b * c;

		System.out.println(ifun.process(10, 20, 30));
		System.out.println(ifunLambda.process(10, 20, 30));

		ValoresBean<Integer> vBean = new ValoresBean<>(10, 20, 30);

		System.out.println(vBean.procesarValores(ifun));
		System.out.println(vBean.procesarValores(ifunLambda));
		System.out.println(vBean.procesarValores((a, b, c) -> a * b * c));
	}

}
