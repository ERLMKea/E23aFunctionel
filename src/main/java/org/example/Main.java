package org.example;

import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void forEachString(List<String> listOfStrings, Consumer<String> consumer) {
        
    }

    public static void main(String[] args) {
        Consumer<String> toUpper = x -> System.out.println(x.toUpperCase());
        toUpper.accept("Hello");

        Consumer<Long> square = t -> System.out.println(t*t);
        square.accept(50L);

        List<String> lstStr = Arrays.asList("hej", "du", "der");
        forEach(lstStr, toUpper);


    }

}