package a_functionalInterface;

import java.util.function.Predicate;

public class _E_Predicate {

    public static void main(String [] args){

        System.out.println("07000000000");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));

        System.out.println(isPhoneNumberContainsSpecificNumber.test("07000000000"));


        System.out.println("is phone number valid and contains isPhoneNumberContainsSpecificNumber ="+
                isPhoneNumberValidPredicate.or(isPhoneNumberContainsSpecificNumber).test("070000000003"));



    }


    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length()==11;

    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length()==11;

    static Predicate<String> isPhoneNumberContainsSpecificNumber = phoneNumber -> phoneNumber.contains("3");

}
