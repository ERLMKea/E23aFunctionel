package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Supplier<Double> ran = () -> Math.random();
        Stream<Double> randomNumbers = Stream.generate(ran);
        //randomNumbers.forEach(System.out::println);
        Function<Double, Long> wholeNumbersOneToHundred = d -> Math.round(d*100);
        Predicate<Long> onlyEqualNumbers = rannum -> rannum % 2 == 0;

//        List<Long> nums12 = randomNumbers.map(dblround)
//                .filter(longEqual)
//                .limit(12)
//                .toList();

        //nums12.forEach(System.out::println);


        var obj = randomNumbers.map(wholeNumbersOneToHundred)
                .filter(onlyEqualNumbers)
                .limit(12)
                .mapToDouble(d -> d)
                .sum();

        System.out.println(obj);


    }

}