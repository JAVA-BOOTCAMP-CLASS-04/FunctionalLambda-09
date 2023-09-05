import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        /**
         * Ejemplo Lambda Predicado (recibe un parametro y devuelve un Boolean, evidentemente
         * lo utilizamos para validar condiciones y realizar filtrados)
         */

        Predicate<Integer> predicate = new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                return t % 2 == 0;
            }
        };

        Predicate<Integer> predicateLambda = t -> t % 2 == 0;

        System.out.println("15 es " + (predicate.test(15) ? "PAR" : "IMPAR"));
        System.out.println("15 es " + (predicateLambda.test(15) ? "PAR" : "IMPAR"));

        Predicate<Integer> predicateLambda2 = t -> t > 10;

        System.out.println("15 es " + (predicateLambda.and(predicateLambda2).test(15) ? "PAR y MAYOR A 10" : (predicateLambda.and(predicateLambda2.negate()).test(15) ? "PAR y MENOR A 10" : (predicateLambda2.and(predicateLambda.negate()).test(15) ? "IMPAR y MAYOR A 10" : "IMPAR Y MENOR A 10"))));
        System.out.println("12 es " + (predicateLambda.and(predicateLambda2).test(12) ? "PAR y MAYOR A 10" : (predicateLambda.and(predicateLambda2.negate()).test(12) ? "PAR y MENOR A 10" : (predicateLambda2.and(predicateLambda.negate()).test(12) ? "IMPAR y MAYOR A 10" : "IMPAR Y MENOR A 10"))));
        System.out.println("9 es " + (predicateLambda.and(predicateLambda2).test(9) ? "PAR y MAYOR A 10" : (predicateLambda.and(predicateLambda2.negate()).test(9) ? "PAR y MENOR A 10" : (predicateLambda2.and(predicateLambda.negate()).test(9) ? "IMPAR y MAYOR A 10" : "IMPAR Y MENOR A 10"))));
        System.out.println("8 es " + (predicateLambda.and(predicateLambda2).test(8) ? "PAR y MAYOR A 10" : (predicateLambda.and(predicateLambda2.negate()).test(8) ? "PAR y MENOR A 10" : (predicateLambda2.and(predicateLambda.negate()).test(8) ? "IMPAR y MAYOR A 10" : "IMPAR Y MENOR A 10"))));

    }
}
