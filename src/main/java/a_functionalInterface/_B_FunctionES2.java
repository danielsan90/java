package a_functionalInterface;

import java.util.function.BiFunction;

/*
-BiFunction<T,U,R> Represents a function that accepts two arguments and produces a result.
 */
public class _B_FunctionES2 {

    public static void main(String [] args){
        //imperativa
       System.out.println(incrementByOneAndMultiply(4,100));
        //BiFunction
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));
    }


    //è l'equivalente della funzione (a)
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction=
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
    //funz (a) imperativa
    static int incrementByOneAndMultiply(int num, int numToMultiplyBy){
        return (num +1) * numToMultiplyBy;
    }

}
