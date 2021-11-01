package a_functionalInterface;

import java.util.function.Function;

/*
intro alle function e all'operatore andThen per concatenarle

- Function<T,R> Represents a function that accepts one argument and produces a result.
 */
public class _A_FunctionES1 {

    public static void main(String [] args){
        //imperativa
        int increment=increment(1);
        System.out.println(increment);

        //funzionale
        int increment2= incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply= multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        //concatena le funzioni
        Function<Integer, Integer> addBy1andThenMultiplyBy10=incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1andThenMultiplyBy10.apply(1));
    }



    //il primo paramentro è input, il secondo è l'output
    static Function<Integer,Integer> incrementByOneFunction= number-> number+1;

    static Function<Integer, Integer> multiplyBy10Function= number-> number * 10;



    static int increment(int num){
        return num +1;
    }

}
