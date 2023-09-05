import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        /**
         * Ejemplo de Lambda Consumer (Recibe un parametro y realiza una accion sobre el mismo,
         * NO devuelve valor)
         */

        Consumer<Integer> consumer = new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
                if (t % 2 == 0) {
                    System.out.println("{PAR [" + t + "]}");
                } else {
                    System.out.println("{IMPAR [" + t + "]}");
                }

            }
        };

        Consumer<Integer> consumerLambda = t -> {
            if (t % 2 == 0) {
                System.out.println("{PAR [" + t + "]}");
            } else {
                System.out.println("{IMPAR [" + t + "]}");
            }

        };

        consumer.accept(10);
        consumer.accept(45);

        consumerLambda.accept(10);
        consumerLambda.accept(45);

        Consumer<Integer> c1 = i -> System.out.println(5 * i);
        Consumer<Integer> c2 = i -> System.out.println(5 + i);

        c1.andThen(c2).accept(4); // 20, 9
        c2.andThen(c1).accept(5); //10, 25
        c1.andThen(c2).andThen(i -> System.out.println(3 * i)).accept(4); // 20, 9, 12

    }
}
