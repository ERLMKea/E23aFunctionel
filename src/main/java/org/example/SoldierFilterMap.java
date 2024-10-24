package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SoldierFilterMap {


    public static interface predicate2 <T, Y> {
        public boolean myFunc(T parm1, Y parm2);
    }


    public static void main(String[] args) {
        List<Soldier> soldiers = new ArrayList<>();
        soldiers.add(new Soldier(4, "Jens"));
        soldiers.add(new Soldier(4, "Jens1"));
        soldiers.add(new Soldier(3, "Jens2"));
        soldiers.add(new Soldier(1, "Ole"));
        soldiers.add(new Soldier(5, "Kurt"));

        Predicate<Soldier> isHighRanked = soldier -> soldier.getRank()>3;

//        var obj = soldiers.stream().filter(isHighRanked).toList();
        var obj = soldiers.stream().filter(soldier -> soldier.getRank()>3).toList();
        obj.forEach(System.out::println);

        Function<Soldier, String> getnames = soldier -> soldier.getName();

        List<String> names = soldiers.stream().map(getnames).toList();
        names.forEach(System.out::println);


    }


}
