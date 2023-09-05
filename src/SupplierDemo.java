import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        /**
         * Ejemplo de Lambda Supplier (No recibe parametros y se utiliza para creacion)
         */
        Supplier<String> str = () -> "Hola Mundo!";

        System.out.println(str.get());

        Supplier<List> listSupplier = ArrayList::new;

        List lInt = listSupplier.get();

        lInt.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(lInt);
    }
}
