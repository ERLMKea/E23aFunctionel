package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

    static void forEachString(List<String> listOfStrings, Consumer<String> consumer) {
        for (String string : listOfStrings) {
            consumer.accept(string);
        }
    }

    static <T> void forEach(List<T> lst, Consumer<T> consumer) {
        for (T t : lst) {
            consumer.accept(t);
        }
    }

    public static void main(String[] args) {
        Consumer<String> toUpper = x -> System.out.println(x.toUpperCase());
        toUpper.accept("Hello");

        Consumer<Long> square = t -> System.out.println(t*t);
        square.accept(50L);

        List<String> lstStr = Arrays.asList("hej", "du", "der");
        forEachString(lstStr, toUpper);

        forEach(lstStr, toUpper);
        System.out.println("xxxxxx");
        lstStr.forEach(toUpper);

    }

}
