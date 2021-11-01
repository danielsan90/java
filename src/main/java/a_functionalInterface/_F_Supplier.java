package a_functionalInterface;

import java.util.function.Supplier;

public class _F_Supplier {

    public static void main(String [] args) {

        System.out.println(getDBConnectionUrlSuplier.get());
    }

    //normale
    static String getDBConnectionUrl(){
        return "jdbc://localhost:5342/users";
    }


    //funzionale
    static Supplier<String> getDBConnectionUrlSuplier = () -> "jdbc://localhost:5342/users";

}
