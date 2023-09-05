import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        /**
         * Ejemplo de Lambda Function (Recibe un parametro y devuelve otro, no necesitan ser ambos parametros del mismo tipo.
         * Claramente se utiliza para realizar transformaciones
         */

        Function<Date, String> funcion = new Function<Date, String>() {

            @Override
            public String apply(Date t) {
                return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(t);
            }
        };

        Function<Date, String> functionLambda = x -> new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(x);

        System.out.println(funcion.apply(Calendar.getInstance().getTime()));
        System.out.println(functionLambda.apply(Calendar.getInstance().getTime()));

        BiFunction<Integer, Integer, String> concat = (x, y) -> x + "-" + y;

        System.out.println(concat.apply(10, 20));

    }
}
