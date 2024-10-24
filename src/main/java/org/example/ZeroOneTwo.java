package org.example;

import java.time.LocalDate;

public class ZeroOneTwo {


    public interface ZeroArgument {
        public void myFunc();
    }

    public static void printZero(ZeroArgument z0) {
        z0.myFunc();
    }

    public interface OneArgument {
        public void myFunc(String str);
    }

    public interface OneArgumentStr {
        public String myFunc(String str);
    }

    public static void printOne(OneArgument z1, String str) {
        z1.myFunc(str);
    }

    public static void printToday(OneArgument z1) {
        LocalDate dt = LocalDate.now();
        z1.myFunc(dt.toString());
    }

    public static String printTodayStr(OneArgumentStr z1) {
        LocalDate dt = LocalDate.now();
        return z1.myFunc(dt.toString());
    }

    public static void main(String[] args) {
        ZeroArgument z0 = () -> System.out.println("Hello I am an interface");
        printZero(z0);

        OneArgument z1 = (str) -> System.out.println(str);
        z1.myFunc("hello");

        OneArgument z11 = System.out::println;
        printOne(z11, "hello");

        OneArgumentStr outStr = (str) -> "I dag er det: " + str;
        String ss = printTodayStr(outStr);
        System.out.println(ss);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }


}
